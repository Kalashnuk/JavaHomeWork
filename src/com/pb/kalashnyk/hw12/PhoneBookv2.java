package com.pb.kalashnyk.hw12;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.module.SimpleModule;
import com.pb.kalashnyk.hw11.*;

import java.io.*;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.stream.Collectors;

public class PhoneBookv2 {

    static void delimiter() {
        System.out.println("-----------------------------------------------------------------------------------------");
    }

    private static String scanner(Scanner scan) {
        String str = scan.nextLine();
        return scan.nextLine();
    }

    private static Contactv2 add(Scanner scan) {
        String str = scan.nextLine();
        System.out.println("Enter your name in the format \"last name, first name, patronymic\":");
        String name = scan.nextLine();

        System.out.println("Enter the date of birth in \"DD/MM/YYYY\" format:");
        LocalDate dtBrth = LocalDate.parse(scan.nextLine(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));

        System.out.println("Enter the phone number in the format \"+380** *******\":");
        String phone = scan.nextLine();

        System.out.println("Enter the address in the format \"City, street, house number\":");
        String address = scan.nextLine();

        Contactv2 contacts = new Contactv2(name, dtBrth, phone, address);
        return contacts;
    }

    private static void edit(List<Contactv2> contactList, Scanner scan) {

        String str = scan.nextLine();
        System.out.println ("Enter your full name from the phone book to search:");
        String name = scan.nextLine();
        int index = -1;

        for (Contactv2 cnt : contactList) {
            if (cnt.getName().equals(name)) {
                index = contactList.indexOf(cnt);
            }
        }

        try {
            Contactv2 contact = contactList.get(index);

            System.out.println();
            System.out.println("1. Edit your full name:");
            System.out.println("2. Edit the date of birth:");
            System.out.println("3. Edit the phone number:");
            System.out.println("4. Edit the address:");
            System.out.println("0. Return to main menu:");

            String option = scan.next();

            switch (option) {
                case "1":
                    System.out.println("Enter a new name for the phone book entry:");
                    contact.setName (scanner (scan));
                    break;
                case "2":
                    System.out.println("Enter the new date in \"DD/MM/YYYY\" format for the phonebook entry:");
                    contact.setDtBrth(LocalDate.parse(scanner(scan),DateTimeFormatter.ofPattern("dd/MM/yyyy")));
                    break;
                case "3":
                    System.out.println("Enter the phone number to write to the phone book:");
                    contact.setNumber(scanner(scan));
                    break;
                case "4":
                    System.out.println("Enter a new address for the phonebook entry:");
                    contact.setAddress(scanner(scan));
                    break;
                case "0":
                    break;
                default:
                    System.out.println("An error occurred while selecting an action. Please try again.");
            }
            contactList.set(index, contact);
            if (!option.equals("0")) {
                System.out.println("Data edited successfully.");
            }

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Name : " + name + " not found in the phone book.");
        }

    }


    public static void main(String[] args) throws Exception {

        String phoneBookJson;

        ObjectMapper mapper = new ObjectMapper();
        mapper.enable(SerializationFeature.INDENT_OUTPUT);

        SimpleModule module = new SimpleModule();
        module.addSerializer(LocalDate.class, new LocalDateSerializer());
        module.addDeserializer(LocalDate.class, new LocalDateDeserializer());
        module.addSerializer(LocalDateTime.class, new LocalDateTimeSerializer());
        module.addDeserializer(LocalDateTime.class, new LocalDateTimeDeserializer());
        mapper.registerModule(module);


        List<Contactv2> phoneBookList = new ArrayList<>();
        Scanner scan = new Scanner(System.in);

        while (true) {
            delimiter();
            System.out.println("Phone Book");
            delimiter();
            System.out.println ("1. Adding a contact to the phone book");
            System.out.println ("2. Deleting a contact from the phone book");
            System.out.println ("2. Find a contact in the phone book");
            System.out.println ("4. Sort contacts");
            System.out.println ("5. Edit contacts in the phone book");
            System.out.println ("6. Show information from the phone book");
            System.out.println ("7. Write to file contacts from the phone book");
            System.out.println ("8. Load all contacts from file");
            System.out.println ("0. Exit the phone book");

            String option = scan.next();

            switch (option) {
                case "1":
                    Contactv2 phoneBook = add(scan);
                    phoneBookList.add(phoneBook);
                    System.out.println("Contact has been successfully added to the phone book");
                    break;

                case "2":
                    System.out.println("Enter your full name from the phone book to delete:");
                    String removeFio = scanner(scan);

                    List<Contactv2> removeList = phoneBookList.stream()
                            .filter(p -> p.getName().equals(removeFio))
                            .collect(Collectors.toList());

                    phoneBookList.removeAll(removeList);
                    System.out.println("Full name has been successfully deleted from the phone book");
                    break;

                case "3":
                    System.out.println("Enter the full name of the entry from the phone book to search:");
                    String searchFio = scanner(scan);
                    phoneBookList.stream()
                            .filter(p -> p.getName().equals(searchFio))
                            .collect(Collectors.toList())
                            .forEach(System.out::println);
                    break;

                case "4":
                    System.out.println("Choose how to sort? \n" +
                            "1. By name: \n" +
                            "2. By address: \n");
                    int choice = scan.nextInt();
                    if (choice == 1) {
                        phoneBookList.stream()
                                .sorted(Comparator.comparing(Contactv2::getName))
                                .collect(Collectors.toList())
                                .forEach(System.out::println);
                    } else if (choice == 2) {
                        phoneBookList.stream()
                                .sorted(Comparator.comparing(Contactv2::getAddress))
                                .collect(Collectors.toList())
                                .forEach(System.out::println);
                    }
                    break;

                case "5":
                    edit(phoneBookList, scan);
                    break;
                case "6":
                    phoneBookJson = mapper.writeValueAsString(phoneBookList);
                    System.out.println(phoneBookJson);
                    break;

                case "7":
                    FileWriter file = new FileWriter("phoneBook.json");
                    phoneBookJson = mapper.writeValueAsString(phoneBookList);
                    file.append(phoneBookJson);
                    file.flush();
                    file.close();

                    System.out.println("Writing to file completed.");
                    break;

                case "8":
                    phoneBookList = new ArrayList<>(Arrays.asList(mapper.readValue(Paths.get("phoneBook.json").toFile(), Contactv2[].class)));
                    phoneBookJson = mapper.writeValueAsString(phoneBookList);
                    System.out.println(phoneBookJson);
                    break;

                case "0":
                    System.out.println("Shutting down the directory");
                    return;
                default:
                    System.out.println ("Error. Unable to execute. Please try again");
            }
        }

    }
}
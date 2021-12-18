package com.pb.kalashnyk.hw11;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.module.SimpleModule;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;



public class PhoneBook {
    private static Object LocalDateTime;

    static void delimiter() {
        System.out.println("-----------------------------------------------------------------------------------------");
    }
    public static void main(String[] args) throws Exception {

        ObjectMapper mapper = new ObjectMapper();
        mapper.enable(SerializationFeature.INDENT_OUTPUT);

        SimpleModule module = new SimpleModule();
        module.addSerializer(LocalDate.class, new LocalDateSerializer());
        module.addDeserializer(LocalDate.class, new LocalDateDeserializer());
        module.addSerializer(LocalDateTime.class, new LocalDateTimeSerializer());
        module.addDeserializer(LocalDateTime.class, new LocalDateTimeDeserializer());
        mapper.registerModule(module);

        Scanner scan = new Scanner(System.in);

        mapper.enable(SerializationFeature.INDENT_OUTPUT);
        List<Contact> contacts = new ArrayList<>();

        contacts.add(new Contact ("Ivanov I.I", LocalDate.of(1991,05,01),"+380990000001 +380501234567","Kyiv, Kievskaya 10"));
        contacts.add(new Contact ("Petrov P.P.",LocalDate.of(1990,07,10),"+380990000002","Harkiv, Svobodu 36"));
        contacts.add(new Contact ("Smirnov S.S.",LocalDate.of(1992,10,15),"+380990000003","Lviv, Franka 75"));
        contacts.add(new Contact ("Shevchenko T.G.",LocalDate.of(1814,04,10),"+380990000777","Kaniv, Sevchenka 100"));


        boolean flag = true;

        do {
            String name;
            String number;
            LocalDate dtBrth;
            String address;

            delimiter();
            System.out.println("Menu");
            delimiter();
            System.out.println("Choose an action:");
            System.out.println("To view all contacts, enter \"8\"");
            System.out.println("To exit, enter \"0\"");
            delimiter();

            System.out.println ("1.Create a contact");
            System.out.println ("2.Delete contact");
            System.out.println ("3.Find contact");
            System.out.println ("4.Sort contacts");
            System.out.println ("5.Change contact");
            System.out.println ("6.Export contacts");
            System.out.println ("7.Import contacts");

            int choice = scan.nextInt();

            switch (choice) {
                case 1:

                    Contact cntc = new Contact();

                    System.out.println ("Enter your name in the format \"last name, first name, patronymic\"");
                    cntc.setName(scan.next());
                    System.out.println ("Enter the date of birth in \"YYYY-MM-DD\" format");
                    while (true) {
                        try {
                            cntc.setDtBrth(LocalDate.parse(scan.next()));
                            break;
                        } catch (Exception ex) {
                            System.out.println("Неверный формат");
                        }
                    }

                    System.out.println ("Enter the phone number in the format \"+380** *******\" split \"_\"");
                    number = scan.next ();
                    List<String> numbers = new ArrayList<>();
                    Collections.addAll(numbers, scan.nextLine().split("\\s"));
                    cntc.setNumber(numbers);

                    System.out.println ("Enter the address in the format \"City, street, house number\"");
                    cntc.setAddress(scan.next());

                    contacts.add(cntc);
                    System.out.println ("Save contact:" + cntc.getName() + ":" + cntc.getNumber());

                case 2:
                    System.out.println ("Delete contact. Enter name");
                    name = scan.next();
                    String finalName = name;
                    contacts.removeIf(ps1 -> ps1.getName().equals(finalName));
                    System.out.println ("Contact :" + name + " deleted.");
                    break;
                case 3:
                    System.out.println ("Enter a name to search");
                    name = scan.next();
                    for (Contact prt : contacts) {
                        if (prt.getName().equals(name)) {
                            System.out.println(prt.info());
                            for (String nam : prt.getNumber()) {
                                System.out.println(nam);
                            }

                        }
                    }
                    break;
                case 4:
                    System.out.println ("Choose how to sort? \n" +
                            "1 - By name \n" +
                            "2 - By date of birth \n");
                    choice = scan.nextInt();
                    if (choice == 1) {
                        contacts.sort(Comparator.comparing(Contact::getName));
                        System.out.println(contacts);
                    } else if (choice == 2) {
                        contacts.sort(Comparator.comparing(Contact::getDtBrth));
                        System.out.println(contacts);
                    }
                    break;
                case 5:
                    System.out.println ("Enter a name to edit :");
                    name = scan.next ();
                    System.out.println ("Select a field to edit :\n" +
                            "1 - Name \n" +
                            "2 - Date of birth \n" +
                            "3 - Address \n" +
                            "4 - Add phone \n");
                    choice = scan.nextInt();
                    switch (choice) {
                        case 1:
                            System.out.println ("Enter a new name :");
                            String newName = scan.next();
                            for (Contact prt : contacts) {
                                if (prt.getName().equals(name)) {
                                    String oldName = prt.getName();
                                    prt.setName(newName);
                                    prt.setLastTimeModified((java.time.LocalDateTime) LocalDateTime);
                                    System.out.println ("Changed from" + oldName + "to" + newName);
                                }
                            }
                            break;
                        case 2:
                            System.out.println ("Enter new date of birth :");
                            dtBrth = LocalDate.parse(scan.next());
                            for (Contact prt : contacts) {
                                if (prt.getName().equals(name)) {
                                    prt.setDtBrth(LocalDate.parse(scan.nextLine(),
                                            DateTimeFormatter.ofPattern("yyyy-MM-dd")));
                                    System.out.println ("Record changed");
                                }
                            }
                            break;
                        case 3:
                            System.out.println ("Enter a new address :");
                            address = scan.next();
                            for (Contact prt : contacts) {
                                if (prt.getName().equals(name)) {
                                    prt.setAddress(address);
                                    System.out.println("Record changed");
                                }
                            }
                            break;
                        case 4:
                            System.out.println ("Enter phone number :");
                            number = scan.next();
                            for (Contact prt : contacts) {
                                if (prt.getName().equals(name)) {
                                    prt.getNumber().add(number);
                                    System.out.println ("Phone added");
                                }
                            }
                            break;

                    }
                    break;
                case 6:
                    String contactJson = mapper.writeValueAsString(contacts);
                    System.out.println(contactJson);
                    File file = Paths.get("./src/com/pb/kalashnyk/hw11/person.json").toFile();
                    FileOutputStream outputStream = new FileOutputStream(file);
                    ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);
                    objectOutputStream.writeObject(contactJson);
                    objectOutputStream.close();
                    System.out.println("Done");
                    break;
                case 7:

                    mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
                    file = Paths.get("./src/com/pb/kalashnyk/hw11/person.json").toFile();
                    List<Contact> contactsImport = Arrays.asList(mapper.readValue(file, Contact[].class));
                    contactsImport.forEach(System.out::println);
                    contacts.addAll(contactsImport);
                    System.out.println("Done");
                    break;
                case 8:
                    for (Contact prt : contacts) {
                        System.out.println(prt);
                    }
                    break;
                case 0:
                    flag = false;
                    break;


            }
        } while (flag);

    }
}
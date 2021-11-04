package com.pb.kalashnyk.hw5;

public class Book {
    private String name;
    private String writer;
    private int year;

    public Book(String name, String writer, int year) {
        this.name = name;
        this.writer = writer;
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWriter() {
        return writer;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    String getInfo1() {
        return "[Name: " + name + ", writer: " + writer + ", year: "
                + year + "]";
    }
    public void sendMessage(String... books) {
        System.out.println("Сообщение отравляется на номера: ");
            for (String number : books) {
                System.out.println(number);
            }
            System.out.println("Сообщение отправлено");
    }

}

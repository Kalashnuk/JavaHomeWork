package com.pb.kalashnyk.hw5;

import com.pb.kalashnyk.hw3.Array;

import java.util.Arrays;

public class Reader {

    private static int bookCount = 0;

    public static int getPhoneCount() {
        return bookCount;}

    String stud;
    int ticketNum;
    String faculty;
    String date;
    String phone;

    public Reader(String stud,int ticketNum,String faculty,String date,String phone){
        this.stud = stud;
        this.ticketNum = ticketNum;
        this.faculty = faculty;
        this.date = date;
        this.phone = phone;

    }
    public String getInfo2() {
        return "[Student: " + stud + ", ticket №: " + ticketNum + ", faculty: "
                + faculty + ", date: " + date + ", phone namber:" +  phone + "]";
    }

    public String getStud() {
        return stud;
    }

    public void setStud(String stud) {
        this.stud = stud;
    }

    public int getTicketNum() {
        return ticketNum;
    }

    public void setTicketNum(int ticketNum) {
        this.ticketNum = ticketNum;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }


    public void takeBook(int bookCount){
        System.out.println(stud + "Take " + bookCount+ " books:");

    }

    public void takeBook(String... names) {
        System.out.println(stud + "Take books: ");
        for (String name : names) {
            System.out.println(name);
            bookCount++;
        }
    }
    public void takeBook(Book... books) {
            System.out.println(stud + "Take books: ");
            for (Book book : books) {
                System.out.println(book);
            }
    }
    public void returnBook(int bookCount){
        System.out.println(stud + "Return " + bookCount+ " books:");

    }

    public void returnBook(String... names) {
        System.out.println(stud + "Return books: ");
        for (String name : names) {
            System.out.println(name);
            bookCount++;
        }
    }
    public void returnBook(Book... books) {
        System.out.println(stud + "Return books: ");
        for (Book book : books) {
            System.out.println(book);
        }
    }
}


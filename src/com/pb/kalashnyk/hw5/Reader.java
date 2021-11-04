package com.pb.kalashnyk.hw5;

public class Reader {
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
    String getInfo2() {
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

    public void takeBook(String stud){
        System.out.println( stud + " Take 3 books: ");
    }
    public void takeBook(String stud, String name) {
        System.out.println( stud + "Take books: " + name + name + name );
    }
    public void takeBook(String stud, String name,String writer,String date, int year){
        System.out.println(stud + "Take books" + name + writer + date + year + name + writer + date + year
                + name + writer + date + year );
    }
    public void returnBook(String stud){
        System.out.println( stud + "Return 3 books: ");
    }
    public void returnBook(String stud, String name) {
        System.out.println( stud + "Return books: " + name + name + name );
    }
    public void returnBook(String stud, String name,String writer,String date, int year){
        System.out.println(stud + "Return books" + name + writer + date + year + name + writer + date + year
                + name + writer + date + year );}

//    public void takeBook (String stud, String... names) {
//        System.out.println(stud + "взял несколько книг");
//        for (String name : names) {
//            System.out.println(name);
//        }
//        }
}

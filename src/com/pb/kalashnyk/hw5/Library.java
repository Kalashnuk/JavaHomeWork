package com.pb.kalashnyk.hw5;

public class Library {
    static void delimiter() {
        System.out.println("-----------------------------------------------------------------------------------------");
    }

    public static void main(String[] args) {

    Book[] books = new Book[5];
    Reader[] = new Reader[3];

    Book book1 = new Book("White Fang","Jack London",1906);
    Book book2 = new Book("The Lord of the Rings","J. R. R. Tolkien",1954);
    Book book3 = new Book("Kobzar","Shevchenko T. G.",1840);
    Book book4 = new Book("Strange Case of Dr Jekyll and Mr Hyde","Stevenson R. L.",1886);
    Book book5 = new Book("Eneyida","Kotlyarevsky I.P.",1798);

    Reader r1 = new Reader("Ivanov I.I",100001,"FKD-11","01.05.1991","+380990000001");
    Reader r2 = new Reader("Petrov P.P.",100002,"MD-21","10.07.1990","+380990000002");
    Reader r3 = new Reader("Smirnov I.I.",100003,"EKD-22","15.09.1992","+380990000003");

        System.out.println("Oll books :");
        delimiter();
            System.out.println("Book 1 " + book1.getInfo1());
    System.out.println("Book 2 " + book2.getInfo1());
    System.out.println("Book 3 " + book3.getInfo1());
    System.out.println("Book 4 " + book4.getInfo1());
    System.out.println("Book 5 " + book5.getInfo1());
            delimiter();
        System.out.println("Oll readers :");
            delimiter();
    System.out.println("Student 1 " + r1.getInfo2());
    System.out.println("Student 2 " + r2.getInfo2());
    System.out.println("Student 3 " + r3.getInfo2());
            delimiter();
    r1.takeBook(r1.getStud());
    r2.takeBook(r2.getStud() + " Take books "+ book1.getName()+ ", " + book2.getName() + ", " + book3.getName());
    r3.takeBook(r3.getStud()+ "Take books" + book1.getName()+ " (" + book1.getWriter() + "," + book1.getYear()+") ");
    r3.takeBook(r3.getStud()+ "Take books"+ book2.getName()+ " (" + book2.getWriter() + "," + book2.getYear()+") " +
                book3.getName()+ " (" + book3.getWriter() + "," + book3.getYear()+") "+
                book4.getName()+ " (" + book4.getWriter() + "," + book4.getYear()+") ");
            delimiter();
    r3.takeBook(r3.getStud());
    r2.takeBook(r2.getStud() + " Take books "+ book5.getName()+ ", " + book4.getName() + ", " + book3.getName());
    r1.takeBook(r1.getStud()+ "Take books" + book3.getName()+ " (" + book3.getWriter() + "," + book3.getYear()+") ");
    r1.takeBook(r1.getStud()+ "Take books"+ book2.getName()+ " (" + book2.getWriter() + "," + book2.getYear()+") " +
                book3.getName()+ " (" + book3.getWriter() + "," + book3.getYear()+") "+
                book5.getName()+ " (" + book5.getWriter() + "," + book5.getYear()+") ");
    }

}

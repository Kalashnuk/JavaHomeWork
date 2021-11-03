package com.pb.kalashnyk.hw5;

public class Library {
    public static void main(String[] args) {

        //Book[] books = new Book[3];
//        books[1] =[name:"White Fang",writer:"Jack London",year:1906]
//        book[i] = new Book (String name, String writer,int year)

    Book book1 = new Book("White Fang","Jack London",1906);
    Book book2 = new Book("The Lord of the Rings","J. R. R. Tolkien",1954);
    Book book3 = new Book("Kobzar","Shevchenko T. G.",1840);
    Book book4 = new Book("Strange Case of Dr Jekyll and Mr Hyde","Stevenson R. L.",1886);
    Book book5 = new Book("Eneyida","Kotlyarevsky I.P.",1798);

        Book[] books = {book1,book2,book3};
        for (Book x : books){}
//            System.out.println(x.toString());
//        }
//        for (Book book : books) {
//            System.out.println(book);
//        }
//        Bookshelf[] booshe = new Bookshelf[book1,book2,book3]

    //Reader[] = new Reader[4]
    Reader r1 = new Reader("Ivanov I.I",100001,"FKD-11","01.05.1991","+380990000001");
    Reader r2 = new Reader("Petrov P.P.",100002,"MD-21","10.07.1990","+38099000002");
    Reader r3 = new Reader("Ivanov I.I.",100003,"EKD-22","15.09.1992","+380990000003");

        System.out.println("Oll books :");
    System.out.println("Book 1 " + book1.getInfo1());
    System.out.println("Book 2 " + book2.getInfo1());
    System.out.println("Book 3 " + book3.getInfo1());
    System.out.println("Book 4 " + book4.getInfo1());
    System.out.println("Book 5 " + book5.getInfo1());
        System.out.println("Oll readers :");
    System.out.println("Student 3 " + r1.getInfo2());
    System.out.println("Student 3 " + r2.getInfo2());
    System.out.println("Student 3 " + r3.getInfo2());
        System.out.println(books.length);



//        r1.stud = "Ivanov I.I";
//        r1.tiektNam = 100001;
//        r1.faculty = "FKD-11";
//        r1.dat = 01.05 .1991;
//        r1.phone = 380990000001;
//
//        r2.stud = "Petrov P. P.";
//        r2.tiektNam = 100002;
//        r2.faculty = "MD-21";
//        r2.dat = 10.07 .1990;
//        r2.phone = 380990000002;
//
//        r3.stud = "Ivanov I.I";
//        r3.tiektNam = 100003;
//        r3.faculty = "EKD-22";
//        r3.dat = 15.09 .1992;
//        r3.phone = 380990000003;
//        System.out.println();
    }

}

package com.pb.kalashnyk.hw8;

import java.util.Scanner;

//import static com.pb.kalashnyk.hw8.Auth.isValidate;

public class OnlineShop {
    public static void main(String[] args) {
        String loginUs;
        String passwordUs;
        String passwordUsRep;
        boolean conf;

        Scanner scann = new Scanner(System.in);
        Auth auth = new Auth();
        System.out.println("Avtorization VVedite login");
        loginUs = scann.nextLine();
        System.out.println("VVedite password");
        passwordUs = scann.nextLine();
        System.out.println("VVedite password agn");
        passwordUsRep = scann.nextLine();


//        try {
//            conf = isValidate(loginUs, passwordUs, passwordUsRep);
//            System.out.println(conf);
//        } catch (WrongLoginException | WrongPasswordException e) {
//            System.out.println(e.getMessage());
//        }


    }
}

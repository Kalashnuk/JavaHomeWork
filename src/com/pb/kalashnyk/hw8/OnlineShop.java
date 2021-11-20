package com.pb.kalashnyk.hw8;

import java.util.Scanner;

public class OnlineShop {
    static void delimiter() {
        System.out.println("-----------------------------------------------------------------------------------------");
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String login;
        String passwd;
        String confirmPasswd;

        Auth auth = new Auth();
        try {
            System.out.println("Authorization");
            delimiter();
            System.out.print("Enter your new username: ");
            login = scan.nextLine();
            System.out.print("Enter a new password: ");
            passwd = scan.nextLine();
            System.out.print("Repeat password: ");
            confirmPasswd = scan.nextLine();
            System.out.println("");
            auth.signUp(login, passwd, confirmPasswd);

            delimiter();
            System.out.println("Sign in to your account");
            delimiter();
            System.out.print("Enter your username: ");
            login = scan.nextLine();
            System.out.print("Enter password: ");
            passwd = scan.nextLine();
            auth.signIn(login, passwd);

        } catch (WrongLoginException | WrongPasswordException e) {
            System.out.println(e.getMessage());
        }
    }
}

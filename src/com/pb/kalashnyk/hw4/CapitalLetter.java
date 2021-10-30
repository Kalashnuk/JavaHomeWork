package com.pb.kalashnyk.hw4;

import java.util.Scanner;

public class CapitalLetter {
    static String text1 () {
        return "Enter the string for example: \"Chatting is worthless. Show me the code. Linus Torvalds\"";
    }
    static String text2 () {
        return "You entered: ";
    }
    static void delimiter () {
        System.out.println("-----------------------------------------------------------------------------------------");
    }
    public static void main(String[] args) {
        Scanner scann = new Scanner(System.in);
        delimiter();
        System.out.println(text1());
        String strin = scann.nextLine();
        delimiter();
        System.out.println(text2() + strin);
        delimiter();
        String[] words = strin.split( " ");
        for (int i=0; i<words.length; i++ ){
            words[i]=Character.toUpperCase(words[i].charAt(0)) + words[i].substring(1);
        }
        for (int i=0; i<words.length; i++ ) {
            System.out.print(words[i] + " ");
            break;
        }
    }
}

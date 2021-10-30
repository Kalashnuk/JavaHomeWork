package com.pb.kalashnyk.hw4;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
    public static boolean isAnagram(String str1, String str2) {
        if (str1.length() != str2.length())
            return false;
        else {
            char[] anag1Arrays = str1.toCharArray();
            char[] anag2Arrays = str2.toCharArray();
            Arrays.sort(anag1Arrays);
            Arrays.sort(anag2Arrays);
            return Arrays.equals(anag1Arrays, anag2Arrays);
        }
    }
    static void delimiter () {
        System.out.println("-----------------------------------------------------------------------------------------");
    }
    public static void main(String[] args) {
        Scanner scann = new Scanner(System.in);
        System.out.println("Enter the string 1");
        String str1 = scann.nextLine();
        delimiter();
        System.out.println("Enter the string 2");
        String str2 = scann.nextLine();
        delimiter();
        str1 = str1.replace("\\s","").toLowerCase();
        str2 = str2.replace("\\s","").toLowerCase();
        if (isAnagram(str1,str2)){
            System.out.println("Strings :" + str1 + " and " + str2 +  " are anagrams");}
        else{
                System.out.println("Strings :" + str1 + " and " + str2 + " are NOT anagrams");
            }
        }

    }

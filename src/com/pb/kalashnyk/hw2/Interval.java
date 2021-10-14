package com.pb.kalashnyk.hw2;

import java.util.Scanner;

public class int3 {
    public static void main(String[] args) {
        Scanner scann = new Scanner(System.in);
        System.out.println("Enter a number between 0 and 100");
        int a = scann.nextInt();
        if (a>=0&&a<=14){
            System.out.println("You entered the number between 0-14");}
        else if (a>=15&&a<=35){
            System.out.println("You entered the number between 15-35");}
        else if (a>=36&&a<=50){
            System.out.println("You entered the number between 36-50");}
        else if (a>=51&&a<=100){
            System.out.println("You entered the number between 51-100");}
        else{
            System.out.println("You entered an invalid number, the number must be between 0 and 100");}

    }
}

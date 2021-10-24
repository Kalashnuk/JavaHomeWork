package com.pb.kalashnyk.hw3;

import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner scann = new Scanner(System.in);
        int[] array = new int[10];
                System.out.println("Enter 10 array numbers");
        array[0] = scann.nextInt();
        array[1] = scann.nextInt();
        array[2] = scann.nextInt();
        array[3] = scann.nextInt();
        array[4] = scann.nextInt();
        array[5] = scann.nextInt();
        array[6] = scann.nextInt();
        array[7] = scann.nextInt();
        array[8] = scann.nextInt();
        array[9] = scann.nextInt();
        System.out.println("-----------------------------------------------------------------------------------------");
        System.out.println("You entered:");
        for (int i=0; i<array.length; i++){
            System.out.println(array[i]);
        }
        System.out.println("-----------------------------------------------------------------------------------------");
        System.out.println("Array sum:");
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }
        System.out.println(sum);
        System.out.println("-----------------------------------------------------------------------------------------");
        System.out.println("You entered positive numbers:");
        int [] arrayPositive = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0) {
                System.out.println( + array[i]);
                arrayPositive[i] = array[i];
            }
        }
        System.out.println("-----------------------------------------------------------------------------------------");
        int positiveNumber = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0) {
                positiveNumber++;
            }
        }
        System.out.println("Positive numbers:");
        System.out.println(positiveNumber);
        System.out.println("-----------------------------------------------------------------------------------------");
        System.out.println("Array after bubble sorts:");
        boolean isSorted = false;
        while (!isSorted){
            isSorted = true;
            for (int i =1; i < array.length; i++){
                if (array[i] < array[i - 1]){
                    int temp = array[i];
                    array[i] = array[i - 1];
                    array[i - 1] = temp;
                    isSorted = false;
                }
            }
        }
        for (int i : array)
            System.out.println(i);
    }
}

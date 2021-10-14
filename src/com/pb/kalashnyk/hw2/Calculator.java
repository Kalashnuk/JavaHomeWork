package com.pb.kalashnyk.hw2;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter an integer operand1");
        int operand1 = scan.nextInt();
        System.out.println("Enter an integer operand2");
        int operand2 = scan.nextInt();
        System.out.println("Enter the command");
        String symbol = scan.next();
        switch (symbol) {
            case "+":
                System.out.println(+ operand1 + symbol + operand2 + "="+ (operand1 + operand2));
                break;
            case "-":
                System.out.println(+ operand1 + symbol + operand2 + "="+(operand1 - operand2));
                break;
            case "*":
                System.out.println(+ operand1 + symbol + operand2 + "="+(operand1 * operand2));
                break;
            case "/":
                if (operand2 == 0) {
                    System.out.println("Can't be divisible by 0");
                } else if (operand2 < 0) {
                    System.out.println(+ operand1 + symbol + operand2 + "="+(operand1 / operand2));
                } else if (operand2 > 0) {
                    System.out.println(+ operand1 + symbol + operand2 + "="+(operand1 / operand2));

                }
        }
    }
}
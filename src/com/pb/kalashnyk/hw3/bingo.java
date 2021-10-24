package com.pb.kalashnyk.hw3;

import java.util.Random;
import java.util.Scanner;

public class Bingo {
    public static void main(String[] args) {
        Scanner scann = new Scanner(System.in);
        Random random = new Random();
        int x=0, y=0, attempt=0;
        System.out.println("|| Enter an integer 0 - 100 ||" + "  End the game dial 666");
        x = random.nextInt(101);
        while (true){
            y = scann.nextInt();
            attempt++;
            if(y==666){
                System.out.println("Try next time.");
                break;
            }
            else if (x<y){
                System.out.println("Sorry, that is too high! Please try again.");}
            else if (x>y){
                System.out.println("Sorry, that is too low! Please try again.");
                                }
            else if (x==y) {
                System.out.println("Nice job! Your guess, " + y + " is correct!"
                        + "Total number of guesses: " + attempt);
                break;}


        }
    }
}
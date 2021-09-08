package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int guess;
        Random rdm = new Random();
        int number = rdm.nextInt(100) + 1;

        System.out.println("I'm thinking of a number between 1-100 (including both)" +
                "\nCan you guess what it is?");

        guess = in.nextInt();
        System.out.println("Your guess: " + guess);
        System.out.println("The number i was thinking of was " + number);
        System.out.println("You were off by: " + Math.abs(guess - number));
    }
}

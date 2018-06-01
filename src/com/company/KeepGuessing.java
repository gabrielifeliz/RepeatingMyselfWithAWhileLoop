package com.company;

/* KeepGuessing.java

    Modify the above program to also exit the while loop if the person guesses "5".
*/

import java.util.Scanner;

public class KeepGuessing {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int secretNumber, guess;

        secretNumber = 123;

        System.out.println("I'm thinking of a number between 1 and 1000");
        System.out.print("Enter the number: ");
        guess = keyboard.nextInt();

        // Exit the while loop if the person guesses the secret number
        while (guess != secretNumber)
        {
            System.out.println("\nYou are wrong. Try again.");
            System.out.println("Enter the number: ");
            guess = keyboard.nextInt();

            // OR also exit the while loop if the person guesses 5
            if (guess == 5)
                break;
        }

        System.out.println("You are correct. You win a prize!");

        keyboard.close();
    }
}
package com.Apjfs;
import java.util.Random;
import java.util.Scanner;

public class RockPaperScissorGame {
    public static void main(String[] args) {
    	//Initialize scanner object and random objects
        Scanner sc = new Scanner(System.in);
        Random r = new Random();

        // Constants for choices
        final int ROCK = 0;
        final int PAPER = 1;
        final int SCISSOR = 2;

        // User input with validation
        int userChoice;
        while (true) {
            System.out.println("Enter 0 for Rock, 1 for Paper, 2 for Scissor:");
            if (sc.hasNextInt()) {
            	//read user input as integer
                userChoice = sc.nextInt();
                if (userChoice >= 0 && userChoice <= 2) {
                    break;//exit loop if valid input
                } else {
                	//prompt for valid input if out of range
                    System.out.println("Invalid input. Please enter 0, 1, or 2:");
                }
            } else {
                System.out.println("Invalid input. Please enter a number:");
                sc.next(); // discard non-integer input
            }
        }

        int computerChoice = r.nextInt(3);

        // Display computer's choice based on random number
        switch (computerChoice) {
            case ROCK:
                System.out.println("Computer chooses Rock.");
                break;
            case PAPER:
                System.out.println("Computer chooses Paper.");
                break;
            case SCISSOR:
                System.out.println("Computer chooses Scissor.");
                break;
        }

        // Determine the result of the game
        if (userChoice == computerChoice) {
        	//check if it's draw
            System.out.println("It's a draw!");
        } else if ((userChoice == ROCK && computerChoice == SCISSOR) ||
                   (userChoice == PAPER && computerChoice == ROCK) ||
                   (userChoice == SCISSOR && computerChoice == PAPER)) {
        	//check if user wins
            System.out.println("Congratulations! You won the match!");
        }
         else {//other wise computer wins
            System.out.println("Sorry, computer won the match. Better luck next time!");
         }

        // Close the scanner to release resources
        sc.close();
    }
}
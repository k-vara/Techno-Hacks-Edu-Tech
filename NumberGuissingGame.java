package com.Apjfs;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class NumberGuissingGame {

	    public static void main(String[] args) {
	    	//scanner object for reading values from user
	        Scanner sc = new Scanner(System.in);
	        //random object for generation random numbers
	        Random random = new Random();
	        boolean playAgain;
         
	        do {
	        	//call the play game methods to start a new game
	            playGame(sc, random);
                //it asks if the user wants to play again?
	            System.out.println("Do you want to play again? (yes/no)");
	            String playChoice = sc.next().toLowerCase();
                //validate user input for replay choice
	            while (!playChoice.equals("yes") && !playChoice.equals("no")) {
	                System.out.println("Invalid input. Please enter 'yes' or 'no'.");
	                playChoice = sc.next().toLowerCase();
	            }
                 //set play again based on user choice  
	            playAgain = playChoice.equals("yes");

	        } while (playAgain);

	        System.out.println("Thank you for playing! Goodbye.");
	        sc.close();//close the scanner object
	    }

	    public static void playGame(Scanner sc, Random random) {
	        int secretNumber = random.nextInt(100) + 1; // Generate random number between 1 and 100
	        int guess;
	        int attempts = 0;
	        boolean correctGuess = false;

	        System.out.println("Welcome to the Number Guessing Game!");
	        System.out.println("Guess a number between 1 and 100:");

	        while (!correctGuess) {
	            try {
	                guess = sc.nextInt();//read users  guess
	                attempts++;
                     //if condition for guessing the number between 1 and 100
	                if (guess < 1 || guess > 100) {
	                    System.out.println("Please enter a number between 1 and 100.");
	                    continue;
	                }
	                 //check if guess matches the secret number
	                if (guess == secretNumber) {
	                    correctGuess = true;
	                    System.out.println("Congratulations! You've guessed the number " + secretNumber + " correctly!");
	                    System.out.println("Number of attempts: " + attempts);
	                } else if (guess < secretNumber) {
	                    System.out.println("Try a higher number.");
	                } else {
	                    System.out.println("Try a lower number.");
	                }
	            } catch (InputMismatchException e) {
	                System.out.println("Invalid input. Please enter a valid number.");
	                sc.next(); // discard invalid input
	            }
	        }
	    }
	}
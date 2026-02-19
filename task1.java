package dailywork;

import java.util.Random;
import java.util.Scanner;

public class task1 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Random random = new Random();

        int totalScore = 0;
        int roundCount = 0;
        String choice;

        System.out.println("Welcome to the Number Guessing Game 😊");

        do {
            roundCount++;

            System.out.println("\n----------------------------");
            System.out.println("Round " + roundCount);
            System.out.println("----------------------------");

            // Generate a random number between 1 and 100
            int secretNumber = random.nextInt(100) + 1;

            int attempts = 0;
            int maxAttempts = 7;
            boolean guessedCorrectly = false;

            System.out.println("I have selected a number between 1 and 100.");
            System.out.println("You have " + maxAttempts + " attempts to guess it.");

            // Loop for guessing
            while (attempts < maxAttempts) {

                System.out.print("Enter your guess: ");
                int userGuess = input.nextInt();
                attempts++;

                if (userGuess == secretNumber) {
                    System.out.println("🎉 Great job! You guessed the number in " + attempts + " attempts.");
                    guessedCorrectly = true;

                    // Score logic
                    totalScore += Math.max(0, 10 - attempts);
                    break;

                } else if (userGuess < secretNumber) {
                    System.out.println("Too low 😅 Try a higher number.");

                } else {
                    System.out.println("Too high 😅 Try a lower number.");
                }
            }

            if (!guessedCorrectly) {
                System.out.println("Sorry! You have used all attempts.");
                System.out.println("The correct number was: " + secretNumber);
            }

            System.out.println("Your current score: " + totalScore);

            System.out.print("Do you want to play again? (yes/no): ");
            choice = input.next();

        } while (choice.equalsIgnoreCase("yes"));

        System.out.println("\nThanks for playing 🎮");
        System.out.println("Total rounds played: " + roundCount);
        System.out.println("Final score: " + totalScore);

        input.close();
    }
}


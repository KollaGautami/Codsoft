import java.util.Random;
import java.util.Scanner;

public class GuessingGame {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int score = 0;
        int rounds = 0;
        boolean playAgain = true;

        while (playAgain) {
            rounds++;
            int numberToGuess = random.nextInt(100) + 1; // Generate a random number between 1 and 100
            int attempts = 0;
            int maxAttempts = 6;

            while (attempts < maxAttempts) {
                attempts++;
                System.out.print("Enter your guess (1-100): ");67
                
                int userGuess = scanner.nextInt();

                if (userGuess < numberToGuess) {
                    System.out.println("Too low!");
                } else if (userGuess > numberToGuess) {
                    System.out.println("Too high!");
                } else {
                    System.out.println("Correct! You guessed the number in " + attempts + " attempts.");
                    score += maxAttempts - attempts; // Calculate score based on remaining attempts
                    break;
                }
            }

            if (attempts == maxAttempts) {
                System.out.println("You didn't guess the number. It was " + numberToGuess);
            }

            System.out.print("Do you want to play again? (yes/no): ");
            String playAgainInput = scanner.next();
            playAgain = playAgainInput.equalsIgnoreCase("yes");
        }

        System.out.println("Your final score is " + score + " over " + rounds + " rounds.");
        
    }
}


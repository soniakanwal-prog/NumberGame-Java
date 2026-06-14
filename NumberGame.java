import java.util.Scanner;
import java.util.Random;

public class NumberGame {
    public static void main(String[] args) {
        // Initialize Scanner and Random objects for stream capture and stochastic generation
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        // Generate a random number between 1 and 100 (Applying the Zero-Index Shift)
        int targetNumber = random.nextInt(100) + 1;
        int userGuess = 0;
        int attempts = 0;
        
        System.out.println("=== Welcome to the DecodeLabs Number Game! ===");
        System.out.println("I have chosen a number between 1 and 100.");
        System.out.println("Can you guess what it is?\n");
        
        // Feedback Loop: Sustains a live loop until the winning condition is satisfied
        while (userGuess != targetNumber) {
            System.out.print("Enter your guess: ");
            
            // Input Stream Capture: Tokenizes the input stream into type-safe integers
            if (scanner.hasNextInt()) {
                userGuess = scanner.nextInt();
                attempts++;
                
                // Logic Architecture checks for decision making
                if (userGuess == targetNumber) {
                    System.out.println("\n Congratulations! You guessed the correct number!");
                    System.out.println("Total Attempts: " + attempts);
                } else if (userGuess > targetNumber) {
                    System.out.println(" Too High! Try a smaller number.\n");
                } else {
                    System.out.println(" Too Low! Try a larger number.\n");
                }
            } else {
                System.out.println(" Invalid input! Please enter a valid integer.\n");
                scanner.next(); // Clears the invalid token from the stream buffer
            }
        }
        
        System.out.println("\nThank you for playing! Project 1 completed successfully.");
        scanner.close();
    }
}

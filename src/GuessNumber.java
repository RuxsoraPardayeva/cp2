import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {
        
        Random rand = new Random();
        Scanner scanner = new Scanner(System.in);

        int number = rand.nextInt(100) + 1; // Random number between 1 and 100
        int points = 100;
        int guess;

        System.out.println("Welcome to Guess the Number Game!");
        System.out.println("Guess a number between 1 and 100.");
        System.out.println("You start with 100 points.\n");

        while (points > 0) {
            System.out.print("Enter your guess: ");
            guess = scanner.nextInt();

            if (guess == number) {
                System.out.println("Correct! You win!");
                System.out.println("Points left: " + points);
                break;
            } 
            else if (guess > number) {
                points -= 10;
                System.out.println("Lower!");
            } 
            else {
                points -= 10;
                System.out.println("Higher!");
            }

            System.out.println("Points left: " + points + "\n");

            if (points == 0) {
                System.out.println("You lose! The correct number was: " + number);
            }
        }

        scanner.close();
    }
}

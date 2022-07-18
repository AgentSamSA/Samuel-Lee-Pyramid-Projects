import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        boolean run = true;

        while (run) {
            int tries = 0;
            boolean guessed = false;
            int number = random.nextInt(20) + 1;
            System.out.println("Hello! What is your name?");

            String name = scanner.next();

            System.out.println("Well, " + name + ", I am thinking of a number between 1 and 20.");

            while (tries < 6) {
                System.out.println("Take a guess.");
                int guess = scanner.nextInt();
                tries++;

                if (guess > number) {
                    System.out.println("Your guess is too high.");
                } else if (guess < number) {
                    System.out.println("Your guess is too low");
                } else {
                    System.out.println("Good job, " + name + "! You guessed my number in " + tries + " guesses!");
                    guessed = true;
                    break;
                }
            }

            if (!guessed) {
                System.out.println("Oh no, " + name + "! You ran out of guesses! My number was " + number + ".");
            }

            System.out.println("Would you like to play again? (y or n)");
            String playAgain = scanner.next();

            if (playAgain.equals("n")) {
                run = false;
            }
        }
        scanner.close();
    }
}

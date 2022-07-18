import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

class InputOutOfBoundsException extends Exception {

}

public class GuessTheNumber {

    static void checkInput(int input) throws InputOutOfBoundsException {
        if (input < 1 || input > 20) {
            throw new InputOutOfBoundsException();
        }
    }
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
                try {
                    int guess = scanner.nextInt();
                    checkInput(guess);
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
                } catch (InputMismatchException ime) {
                    System.out.println("Exception: Input must be an integer");
                    System.exit(1);
                } catch (InputOutOfBoundsException e) {
                    System.out.println("Exception: Input must be between 1 and 20");
                    System.exit(1);
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

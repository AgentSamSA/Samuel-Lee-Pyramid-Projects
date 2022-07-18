import java.util.Scanner;
import java.util.Random;

public class DragonCave {
    public static void main(String[] args) {
        Random rand = new Random();
        int badDragon = rand.nextInt(2) + 1;

        Scanner scanner = new Scanner(System.in);

        System.out.println("You are in a land full of dragons. In front of you,");
        System.out.println("you see two caves. In one cave, the dragon is friendly");
        System.out.println("and will share his treasure with you. The other dragon");
        System.out.println("is greedy and hungry and will eat you on sight.");
        System.out.println("Which cave will you go into? (Enter 1 or 2)");

        int userInput = scanner.nextInt();

        System.out.println("You approach the cave...");
        System.out.println("It is dark and spooky...");
        System.out.println("A large dragon dumps out in front of you! He opens his jaws and...");

        if (userInput == badDragon) {
            System.out.println("Gobbles you down in one bite!");
        } else {
            System.out.println("Laughs and offers you a piece of treasure!");
        }

        scanner.close();
    }
}
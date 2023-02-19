import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;
public class GuessNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Hello! What is your name?");
        String name = sc.nextLine();
        boolean playerPlaying = true;

        Random rand = new Random();
        int randomValue = 1 + rand.nextInt(20);
        int count;
        while (playerPlaying) {
            count = 1;
            System.out.println("Well, " + name + ", I am thinking of a number between 1 and 20.");
            System.out.println("Take a guess.");
            try {
                int userInput = sc.nextInt();

                while (userInput != randomValue) {
                    count++;
                    if (userInput > randomValue) {
                        System.out.println("Your guess is too high.");
                    } else {
                        System.out.println("Your guess is too low.");
                    }
                    System.out.println("Take a guess.");
                    userInput = sc.nextInt();
                }
                System.out.println("Good job, " + name + "! You guessed my number in " + count + " guesses!");

                System.out.println("Would you like to play again? (y or n)");
                String playResponse = sc.next();
                playerPlaying = !(playResponse.startsWith("N") || playResponse.startsWith("n"));
            } catch (InputMismatchException exception) {
                System.out.println("You entered an Invalid input, please start over!");
                break;
            }
        }
    }
}


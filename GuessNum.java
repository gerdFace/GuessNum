import java.util.Random;
import java.util.Scanner;

public class GuessNum {

    public static void main(String[] args) {
        Scanner userin = new Scanner(System.in);
        Random rand = new Random();
        int a = rand.nextInt(100) + 1;
        int guess = 0;
        int count = 0;

        System.out.println("I'm thinking of a number from 1 to 100.");
        System.out.println("Can you guess what it is in 5 tries?");

        while (guess != a) {
            guess = userin.nextInt();
            count++;
            if (guess > a) {
                System.out.println("lower!");
            } else if (guess < a) {
                System.out.println("higher!");
            } else if (guess == a) {
                System.out.println("Congratulations. You guessed the number with "
                        + count + " tries!");
            }
            if (guess > 100) {
                System.out.println("The number is between 1 and 100.");
            }
            if (guess < 0) {
                System.out.println("The number is between 1 and 100.");
            }
            if (count >= 5) {
                System.out.println("You are out of guesses.");
                System.out.println("The number was " + a + ".");
                break;
            }
        }
    }
}

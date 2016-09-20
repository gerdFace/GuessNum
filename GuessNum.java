import java.util.Random;
import java.util.Scanner;

public class GuessNum {

    public static void main(String[] args) {
        Scanner userin = new Scanner(System.in);
        Random rand = new Random();
        int theNum = rand.nextInt(100) + 1;
        int guess = 0;
        int count = 0;

        System.out.println("I'm thinking of a number from 1 to 100.");
        System.out.println("Can you guess what it is in 5 tries?");

        while (true) {
            guess = userin.nextInt();
            count++;
            winGame(theNum, guess, count);
            loseGame(theNum, guess, count);
            helpUser(guess, theNum, count);
        }
    }

    private static boolean loseGame(int theNum, int guess, int count) {
        if ((count >= 5) && (guess != theNum)) {
            System.out.println("You are out of guesses.");
            System.out.println("The number was " + theNum + ".");
        }
        return false;
    }

    private static void winGame(int theNum, int guess, int count) {
        if (guess == theNum) {
            System.out.println("Congratulations. You guessed the number with "
                    + count + " tries!");
        }
    }

    private static void helpUser(int guess, int theNum, int count) {
        if (guess > theNum) {
            System.out.println("lower!");
        } else if (guess < theNum) {
            System.out.println("higher!");
        }
        if (count == 4) {
            System.out.println("Last try!");
        }
        if ((guess > 100) || (guess < 0)) {
            System.out.println("The number is between 1 and 100.");
        }
    }
}


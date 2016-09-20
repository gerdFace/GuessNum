import java.util.Random;
import java.util.Scanner;

public class GuessNum {

    private static int guessesLeft = 5;
    private static int count = 0;
    private static int guess;

    public static void main(String[] args) {
        Scanner userin = new Scanner(System.in);
        Random rand = new Random();
        int theNum = rand.nextInt(100) + 1;

        System.out.println("I'm thinking of a number from 1 to 100.");
        System.out.println("Can you guess what it is in 5 tries?");

        while (guessesLeft > 0) {
            guess = userin.nextInt();
            count++;
            --guessesLeft;
            winGame(theNum, guess, count);
            loseGame(theNum, guess, count);
            helpUser(guess, theNum, count);
        }
    }

    private static void loseGame(int theNum, int guess, int count) {
        if ((count >= 5) && (guess != theNum)) {
            System.out.println("You are out of guesses.");
            System.out.println("The number was " + theNum + ".");
        }
    }

    private static void winGame(int theNum, int guess, int count) {
        if (guess == theNum) {
            System.out.println("Congratulations. You guessed the number with "
                    + count + " tries!");
        }
    }

    private static void helpUser(int guess, int theNum, int count) {
        if ((guess > theNum)&& (guessesLeft > 0)) {
            System.out.println("lower!");
        } else if ((guess < theNum) && (guessesLeft > 0)) {
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


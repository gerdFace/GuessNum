import java.util.Random;
import java.util.Scanner;

public class GuessNum {

    private static int count = 0;
    private static int guess;

    public static void main(String[] args) {
        Scanner userIn = new Scanner(System.in);
        Random rand = new Random();
        int theNum = rand.nextInt(100) + 1;

        System.out.println("I'm thinking of a number from 1 to 100.");
        System.out.println("Can you guess what it is in 5 tries?");

        while (count <= 5) {
            guess = userIn.nextInt();
            count++;
            winGame(theNum, guess, count);
            loseGame(theNum, guess, count);
            helpUser(guess, theNum, count);
        }
    }
/*When count exceeds 5 without successful guess the program displays "lose message" and prints the correct number*/
    private static void loseGame(int theNum, int guess, int count) {
        if ((count >= 5) && (guess != theNum)) {
            System.out.println("You are out of guesses.");
            System.out.println("The number was " + theNum + ".");
        }
    }
/*When user guesses correct number "win message" is displayed with number of tries*/
    private static void winGame(int theNum, int guess, int count) {
        if (guess == theNum) {
            System.out.println("Congratulations. You guessed the number with "
                    + count + " tries!");
        }
    }
/*User is given helpful information for each guess that is incorrect*/
    private static void helpUser(int guess, int theNum, int count) {
        if ((guess > theNum) && (count < 5)) {
            System.out.println("lower!");
        } else if ((guess < theNum) && (count < 5)) {
            System.out.println("higher!");
        }
        if (count == 4) {
            System.out.println("Last try!");
        }
        if ((guess > 100) || (guess < 0)) {
            System.out.println("The number is between 1 and 100.");
        }
    }
/*    When method is called guess and count are affected, why?
    private static int randomNum () {
        Random rand = new Random();
        return rand.nextInt(100) + 1;
    }*/
}


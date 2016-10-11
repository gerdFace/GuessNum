import java.util.Random;
import java.util.Scanner;

public class GameLauncher {

    private static int count = 0;
    private static int guess;
    private static int theNum;
    private static GameRules game;
    private static Random rand;
    private static Scanner userIn;

    public static void main(String[] args) {
        userIn = new Scanner(System.in);
        rand = new Random();
        theNum = rand.nextInt(100) + 1;
        game = new GameRules();
        System.out.println("I'm thinking of a number from 1 to 100.");
        System.out.println("Can you guess what it is in 5 tries?");

        while (count < 5) {
            guess = userIn.nextInt();
            count++;
            game.helpUser(guess, theNum, count);
            game.loseGame(theNum, guess, count);
            game.winGame(theNum, guess, count);

        }
    }
}
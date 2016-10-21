package main;
import java.util.Scanner;

public class GameLauncher {

    public static void main(String[] args) {
        int count = 0;
        int guess = 0;
        int theNum = new RandomNum().getTheNum();
        GameRules game = new GameRules();
        Scanner userIn = new Scanner(System.in);
        HighScore score = new HighScore();

        System.out.println("I'm thinking of a number from 1 to 100.");
        System.out.println("Can you guess what it is in 5 tries?");

        while ((count < 5) && (guess != theNum)) {
            guess = userIn.nextInt();
            count++;
            game.helpUser(guess, theNum, count);
            game.loseGame(theNum, guess, count);
            game.winGame(theNum, guess, count);
        }
        score.setScore(count);
    }
}
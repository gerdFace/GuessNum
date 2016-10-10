
public class GameRules {
    /*When count exceeds 5 without successful guess the program displays "lose message" and prints the correct number*/
    public void loseGame(int theNum, int guess, int count) {
        if ((count >= 5) && (guess != theNum)) {
            System.out.println("You are out of guesses.");
            System.out.println("The number was " + theNum + ".");
        }
    }

    /*When user guesses correct number "win message" is displayed with number of tries*/
    public void winGame(int theNum, int guess, int count) {
        if (guess == theNum) {
            System.out.println("Congratulations. You guessed the number with "
                    + count + " tries!");
        }
    }

    /*User is given helpful information for each guess that is incorrect*/
    public void helpUser(int guess, int theNum, int count) {
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
}

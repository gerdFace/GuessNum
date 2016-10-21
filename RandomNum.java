package main;
import java.util.Random;

public class RandomNum {

    public int getTheNum() {
        Random rand = new Random();
        int theNum = rand.nextInt(100) + 1;
        return theNum;
    }
}

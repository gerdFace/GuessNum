package main;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class HighScore {

    public static final File FILE = new File("C:\\Code\\Beginner_Code\\Random_Projects\\GuessNum_2\\Scores\\NewScore.html");

    public void setScore(int count) {

        Scanner initials = new Scanner(System.in);

        System.out.println("Please, enter your initials.");

        try {

            String playerInitials = initials.next();
            String content = "The current high score holder is " + playerInitials + " with a score of " + count + ".";

            if (!FILE.exists()) {
                FILE.createNewFile();
            }

            FileWriter fw = new FileWriter(FILE.getAbsoluteFile());
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(content);
            bw.close();

            System.out.println("Done");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

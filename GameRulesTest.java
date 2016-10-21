import main.GameRules;
import org.junit.Assert;
import org.junit.Test;

public class GameRulesTest {

    @Test
    public void canLoseGame() {
        GameRules gameRules = new GameRules();
        String result = "You Lose";

        Assert.assertEquals(result, gameRules.loseGame(5, 5, 10));
    }
}

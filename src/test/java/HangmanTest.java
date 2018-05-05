import org.junit.Test;
import static org.junit.Assert.*;


public class HangmanTest {

    @Test
    public void test_HangmanStart_Correctly(){
        Hangman hangman = new Hangman("moringa");
        assertNotNull(hangman);
    }
    @Test (expected = IllegalArgumentException.class)
    public void testNoCharacterOrNumber_Submitted(){
        Hangman hangman = new Hangman("");
    }
} 
import org.junit.Test;
import static org.junit.Assert.*;

import java.util.Arrays;


public class HangmanTest {

    @Test
    public void test_HangmanStart_Correctly(){
        Hangman hangman = new Hangman("o");
        assertNotNull(hangman);
    }
    @Test (expected = IllegalArgumentException.class)
    public void testNoCharacterOrNumber_Submitted(){
        Hangman hangman = new Hangman("");
    }
    // Test for random picking of word
    @Test
    public void test_RandomWordReturned(){
    Hangman hangman = new Hangman("l");
    String expected = "robot";
    assertEquals(expected,hangman.randomWord());
    }
    @Test
    public void test_convertWordToArrayOfCharacters() {
        Hangman hangman = new Hangman("robot");
        String expected = "robot";
        String newExpected = Arrays.toString(expected.toCharArray());
        assertEquals(newExpected, hangman.convertWordToArray());
    }
    @Test
    public void test_ReplaceCharactersWithAsterisks(){
        Hangman hangman = new Hangman("robot");
        String expected = "*****";
        assertEquals(expected, hangman.changeToAsterisk());
    }
    // @Test
    // public void test_guessCorrectWords(){
    //     Hangman hangman = new Hangman("Robot");
    //     String expected = "*o*o*";
    //     assertEquals(expected, hangman.guessCorrectWord());
    // }
} 
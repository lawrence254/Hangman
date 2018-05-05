import org.junit.Test;
import static org.junit.Assert.*;


public class HangmanTest {

    @Test
    public void test_HangmanStart_Correctly(){
        Hangman hangman = new Hangman("moringa");
        assertNotNull(hangman);
    }
    
} 
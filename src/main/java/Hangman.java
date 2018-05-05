import java.lang.IllegalArgumentException;
import java.util.Random;
public class Hangman {
    String[] words = { "Terminator", "Slicer","Ninja", "cow", "Robot", "littlegirl" };
    String name = words[(int) (Math.random() * words.length)];
    private String letter;

    public Hangman(String input){

        if (input.length()>0 && input.matches("[a-zA-Z]+")) {
            this.letter= input;
                
        } else {
            throw new IllegalArgumentException("Can't accept empty string");
        }
    }
    public String getChar(){
        return this.letter;
    }
}
import java.lang.IllegalArgumentException;
import java.util.Random;
public class Hangman {
    Random random = new Random();
    String[] words = { "Terminator", "Slicer","Ninja", "cow", "Robot", "littlegirl" };
    int position = random.nextInt(words.length);

    private String randomWord;
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
    public String randomWord(){
        randomWord = this.words[position];
        return randomWord;
    }
}
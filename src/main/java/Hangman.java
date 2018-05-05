import java.lang.IllegalArgumentException;

public class Hangman {

    private String letter;

    public Hangman(String word){

        if (word.length()>0 && word.matches("[a-zA-Z]+")) {
            this.letter= word;
                
        } else {
            throw new IllegalArgumentException("Can't accept empty string");
        }
    }
    public String getChar(){
        return this.letter;
    }
}
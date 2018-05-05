import java.lang.IllegalArgumentException;
import java.util.Random;
import java.util.Arrays;

public class Hangman {
    Random random = new Random();
    String[] words = {"Robot"};
    int position = random.nextInt(words.length);

    private String letter;
    public String randomised;    
    private String replacedString;
    private char[] newChars;
 
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
        String selectedWord = this.words[position];
        this.randomised = selectedWord;           
        return this.randomised;        
    }
    public String convertWordToArray(){
        Hangman hangman = new Hangman(randomWord());
        char[] characters = randomised.toCharArray();
        this.newChars = characters;
        System.out.println("New chars is: "+Arrays.toString(this.newChars));
        String finalValue = Arrays.toString(this.newChars);
        System.out.println("Final: "+finalValue);
        System.out.println("Submitting "+finalValue);        
        return finalValue;
    }
    public String changeToAsterisk(){
        return this.replacedString;
    }

}
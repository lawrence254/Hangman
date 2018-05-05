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
        // System.out.println("Selected word is:"+selectedWord);
        this.randomised = selectedWord;
        // System.out.println(Arrays.toString(randomised.toCharArray()));
        // System.out.println("Random word is:"+randomised);               
        return this.randomised;        
    }
    public String convertWordToArray(){
        Hangman hangman = new Hangman(randomWord());
        // System.out.println("Starting conversion on "+hangman.randomised);
        char[] characters = randomised.toCharArray();
        this.newChars = characters;
        System.out.println("New chars is: "+Arrays.toString(this.newChars));
        String finalValue = Arrays.toString(this.newChars);
        System.out.println("Final: "+finalValue);
        System.out.println("Submitting "+finalValue);        
        return finalValue;
    }

}
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
    private String finalValue;
 
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
        this.finalValue = Arrays.toString(this.newChars);
        System.out.println("Final: "+this.finalValue);
        System.out.println("Submitting "+this.finalValue);   
        // Hangman hangman2=new Hangman(changeToAsterisk(this.finalValue));                   
        return this.finalValue;
    }
    public String changeToAsterisk(String inpuString){  
        // System.out.println(inpuString);    
        // int strLen = inpuString.length();
        // StringBuilder sb = new StringBuilder(strLen);
        // for(int i = 1; i < strLen; i++){
        //     sb.append('*');
        // }
        
        // System.out.println("Word is: "+ inpuString);
        // System.out.println("Length: "+strLen);
        // this.replacedString = sb.toString();
        // return this.replacedString;
        StringBuffer sb = new StringBuffer();
    for (int x = 0; x < inpuString.length(); x++) {
        sb.append("*");
    }
    System.out.println("Chars are: "+sb.toString());
    System.out.println("Original word is: "+inpuString);
    return sb.toString();
    }

}
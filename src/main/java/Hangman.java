import java.lang.IllegalArgumentException;
import java.util.Random;
import java.util.Arrays;
import java.util.Scanner; 

public class Hangman {
    Random random = new Random();
    private String selectedTerm;


    private String letter;
    public String randomised;    
    private String replacedString;
    private char[] newChars;
    private String finalValue;
    private String guessWord;
    private char[] characters;
    private String userGueses;
    private int MaxLength = 0;
 
    public void startGame(){
        String[] terms = {"robot","mase","technology","java"};
        int position = random.nextInt(terms.length);
        selectedTerm = terms[position];
    }

    public String getTerm(){
        return selectedTerm;
    }
    


    // public Hangman(){
    //     randomWord();
    //     changeToAsterisk();
    //     // getChar(input);
    //     if (input.length()>0 && input.matches("[a-zA-Z]+")) {
    //         this.letter= input;
                
    //     } else {
    //         throw new IllegalArgumentException("Can't accept empty string");
    //     }
    // }
    public String getChar(String guessLetter){
        guessCorrectWord();
        return this.letter=guessLetter;
    }

    //Can be in the constructor since its run only once/initialize method in the constructor
    // public String randomWord(){
    //     String selectedWord = this.words[position];
    //     System.out.println("Selected word is: "+selectedWord);
    //     this.randomised = selectedWord;           
    //     return randomised;        
    // }
    public String convertWordToArray(){
        characters = randomised.toCharArray();
        newChars = this.characters;
        System.out.println("New chars is: "+Arrays.toString(this.newChars));
        this.finalValue = Arrays.toString(this.newChars);
        System.out.println("Final: "+this.finalValue);
        System.out.println("Submitting "+this.finalValue);
                  
        return this.finalValue;
    }
    public String changeToAsterisk(){  
    StringBuffer sb = new StringBuffer();
    for (int x = 0; x < this.randomised.length(); x++) {
        sb.append("*");
    }
    System.out.println("Stared are: "+sb.toString());
    System.out.println("Original word is: "+this.randomised);
    this.replacedString = sb.toString();
        return sb.toString();

    }

    public String guessCorrectWord(){
        char[] answer=replacedString.toCharArray();
        System.out.println("Enter a character to guess: ");
        // char guessWord = scanner.next().charAt(0);
        // char guessWord = 'o';
        String selectedWord = new String(replacedString);
        StringBuilder builder = new StringBuilder(selectedWord);
        // for (int i = 0; i<characters.length; i++) {
        //     if (guessWord == characters[i]) {
        //         builder.setCharAt(i,guessWord);
        //         System.out.println("replacing: "+i+ " with "+guessWord);
        //     }

        // }
            // Maintain below code
            // this.userGueses = replacedString.replace((Arrays.toString(characters)), "o");
            // System.out.println("user guess: "+this.userGueses);
        
        return this.userGueses;
    }
    

}
import java.util.Scanner;
import java.io.*;

public class App{
    String termSelected;
    int length;
    Console myConsole = System.console();
    char[] array;
    int score;


    public static void main(String []args) {
        App choose =  new App();
        choose.chooseTerm();
        choose.playGame();
       
             
    }
    public void chooseTerm(){
        Hangman word =  new Hangman();
        word.startGame();
        termSelected = word.getTerm();
        array = termSelected.toCharArray();
        length = array.length;
        System.out.println("Welcome Hangman. A random word has been selected, please guess the word.\r\nCLUE: Technology terms. The word is " + length + " characters long.");
        
    }

    public void playGame(){
        char[] stars = new char[length];
        for(int i=0;i<length;i++){
            stars[i] = '*';
        }
        String techTerm = new String(stars);
        StringBuilder answer = new StringBuilder(techTerm);
        for(int j=0;j<100;j++){
            System.out.println("Please guess a letter: " + techTerm);
            String input = myConsole.readLine();
            char letter = input.charAt(0);
            System.out.println("Selected letter: " + letter);
            for(int a=0;a<length;a++){
                if(letter == array[a]){
                    answer.setCharAt(a, letter);
                    System.out.println(answer);
                    score++;
                }
            }
            if(score == length){
                System.out.println("Congrats. You've guessed the technology term.");
                j=100;
            }
        }
    }
}

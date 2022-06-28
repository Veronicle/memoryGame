import java.util.ArrayList;
import java.util.Scanner;
public class memoryGame {

    private int duration;
    private String[] words = {"habit", "squirrel", "dog", "happy", "India", "dictionary", ""};
    private ArrayList<Integer> usedIndices = new ArrayList<Integer>();
    private Scanner araash = new Scanner(System.in);


    public memoryGame(int d) {
        if (d > words.length) {
            System.out.println("You must choose a number from 1 to " + words.length + ". Please try again: ");
        }
        duration = d;
    }

    public void play() {
        int current = 1;
        int ind = (Math.random() * (words.length)); 
        for (int i = 0; i < usedIndices.size(); i++) {
            if (ind = usedIndices.get(i))
                ind = (Math.random() * (words.length));
        }
        while (current <= duration) {
            usedIndices.add(ind);    
            String word = words[ind];
            System.out.println("Welcome to the Memory Game! I will provide you with a word; then you will have to respond what that word is.");
            System.out.println("Word #" + current + " is " + word + ". ");
            for (int i = 1; i <= 200; i++) { // creates filler lines, so she cannot look up
                System.out.println("i");
            }
            System.out.println("What is the word?");
            String guess = araash.nextLine();
            while (!(guess.equalsIgnoreCase(word))) {
                int temp = 1;
                System.out.println("You were wrong :(. Here is a hint...");
                System.out.println("The first " + temp + " letters of the magic word are " + word.substring(0, temp));
                temp++;
            }
            System.out.println("Your correctly guessed " + word + "!");
            current++;
        }
        System.out.println("Thank you for playing the Memory Game!");
    }


    
}

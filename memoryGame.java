import java.util.ArrayList;
import java.util.Scanner;
public class memoryGame {

    private Scanner araash = new Scanner(System.in);
    private ArrayList<memoryObject> items = new ArrayList<memoryObject>(); 

    public memoryGame() {
        // Create the memory items
        memoryObject o1 = new memoryObject("habit", "A definition of this word is \"a common task\"", "This word rhymes with rabbit" );
        memoryObject o2 = new memoryObject("squirrel", "This is an animal that climbs trees", "This word rhymes with referral");
        memoryObject o3 = new memoryObject("dog", "Your favorite animal!", "This word rhymes with flog");
        memoryObject o4 = new memoryObject("happy", "The opposite of feeling sad", "This word rhymes with sappy");
        memoryObject o5 = new memoryObject("India", "This is the country you are from", "");
        memoryObject o6 = new memoryObject("dictionary", "A book with every word in a language", "The word rhymes with pictionary");
        memoryObject o7 = new memoryObject("laptop", "A mobile computer", "This device folds");
        // More objects updated as of 7/18/22
        memoryObject o8 = new memoryObject("book", "Something that authors write", "A physical object for reading");
        memoryObject o9 = new memoryObject("cup", "Something that holds liquids", "It is cyldrincal in shape");
        memoryObject o10 = new memoryObject("television", "you watch shows and movies on this", "");
        memoryObject o11 = new memoryObject("golf", "A sport with clubs, a ball, and tees", "Many peopls in the family play it");
        memoryObject o12 = new memoryObject("music", "Something that lots of people, including you, like listening to", "");
        memoryObject o13 = new memoryObject("shoes", "A pair of these are worn on feet", "I - Araash - sell these");
        memoryObject o14 = new memoryObject("trophy", "Given to people who win something", "They often are gold or silver in color");
        // Adding all the words-to-be-guessed to an array list
        memoryObject[] array = {o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12, o13, o14}; 
        addObjects(array);
        
    }

    public void addObjects(memoryObject[] arr) {
        for (int i = 0; i < arr.length; i++) {
            items.add(arr[i]);
        }
    }

    public void play() {

        // Introduction
        System.out.println("Welcome to the game of memory! The objective of this game is to maximize your score by guessing the right words based on the hints that I provide to you. Let's begin :)");

        // Null instantiation of guess
        String guess = "";

        // Null instantiation of score
        int score = 0;

        // Iterates through all the words
        for (int i = 0; i < items.size(); i++) {
            System.out.println("-------------->\nWord " + (i + 1) + ":"); // Word 1
            System.out.println("Hint 1: " + items.get(i).getHint1()); // Hint 1
            System.out.println("Do you want another hint? Your score will go down if so. Enter yes or no: "); // Prompts for Hint 2
            String ans = araash.nextLine(); // yes/no for Hint 2
            if (ans.equalsIgnoreCase("yes")) {
                System.out.println("Hint 2: " + items.get(i).getHint2());
                score--; // shows hint 2 if "yes" but score decrements
            }
            while (!(guess.equalsIgnoreCase(items.get(i).getObject()))) { // while the word is not guessed, will re-prompt
                System.out.println("Enter your guess: ");
                guess = araash.nextLine();    
            }      
            score++; // score increments once guess is correct 
            }

            araash.close(); // close scanner at end - common practice

            System.out.println("Thank you for playing. Your final score was " + score + " points."); // shows final score

        }

    public static void main(String[] args) {
        
        memoryGame trial = new memoryGame();
        trial.play();
    
    }

        /* Old, flawed method => completely changed it
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
         */
    }


    


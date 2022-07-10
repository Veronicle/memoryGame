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
        // Adding all the words-to-be-guessed to an array list
        items.add(o1);
        items.add(o2);
        items.add(o3);
        items.add(o4);
        items.add(o5);
        items.add(o6);
        items.add(o7);
    }

    public void play() {

        System.out.println("Welcome to the game of memory! The objective of this game is to maximize your score by guessing the right words based on the hints that I provide to you. Let's begin :)");

        String guess = "";
        int score = 0;

        for (int i = 0; i < items.size(); i++) {
            System.out.println("Word " + (i + 1) + ":");
            System.out.println("Hint 1: " + items.get(i).getHint1());
            System.out.println("Do you want another hint? Your score will go down if so. Enter yes or no: ");
            String ans = araash.nextLine();
            if (ans.equalsIgnoreCase("yes")) {
                System.out.println("Hint 2: " + items.get(i).getHint2());
                score--;
            }
            while (!(guess.equalsIgnoreCase(items.get(i).getObject()))) {
                System.out.println("Enter your guess: ");
                guess = araash.nextLine();    
            }      
            score++;
            }

            araash.close();

            System.out.println("Thank you for playing. Your final score was " + score + " points.");

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


    


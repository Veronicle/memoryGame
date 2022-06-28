import java.util.Scanner;
public class memoryGameTest {
    public static void main(String[] args) {

        Scanner araash = new Scanner(System.in);
        System.out.println("How many words do you want to repeat to me?");
        int duration = araash.nextInt();
        memoryGame Trial = new memoryGame(duration);
        Trial.play();
        araash.close();

    }
}
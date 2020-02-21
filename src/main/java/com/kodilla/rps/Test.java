/*
import java.util.Random;
import java.util.Scanner;

public class test {

    enum Gesture
    {
        rock(1),
        paper(2),
        scissors(3);

        private int type;
        Gesture(int type) {
            this.type = type;
        }
        public int getType(){ return type; }
    }

    public static void main(String[] args) {
        final Scanner keyboard = new Scanner(System.in);
        System.out.println("Please enter “S” for scissors, “R” for rock, or “P” for paper.");
        final String choice = keyboard.next();

        if (choice.equals("S")) {
            generateDraw(Gesture.scissors);
        }
        else if (choice.equals("R")) {
            generateDraw(Gesture.rock);
        }
        else if (choice.equals("P")) {
            generateDraw(Gesture.paper);
        }

        keyboard.close();
    }

    public static void generateDraw(Gesture gesture) {
        final Random random = new Random();
        final int computerDraw = random.nextInt(3);
        System.out.println(computerDraw);

        if (computerDraw > gesture.getType()) {
            System.out.println("You lose.");
        }
        else if (computerDraw < gesture.getType()) {
            System.out.println("You win.");
        }
        else {
            System.out.println("It is a tie.");


        }
    }
}
*/

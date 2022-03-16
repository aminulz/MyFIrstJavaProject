package excersizeofArray;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;
public class guessingGame {
    public static void main(String[] args) {
        String replay = "";
        do {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter player name : ");

            String playerName = scanner.nextLine();
            int min = 1, max = 40;
            int secretNum = ThreadLocalRandom.current().nextInt(min, max + 1);
            System.out.println("Hello " + playerName + ", let's play a guessing game.");
            System.out.println("I am guessing a number between 1 and 40. Can you guess the number? ");
            System.out.println("YOu have 7 guesses, good luck!");
            for (int i = 0; i < 1; i++) {
                System.out.println("Your guess: ");
                int playerGuess = scanner.nextInt();
                if (playerGuess > secretNum) {
                    System.out.println("Smaller!");
                } else if (playerGuess < secretNum) {
                    System.out.println("Bigger!");
                } else if (playerGuess > max) {
                    System.out.println("Between 40, dummy!");
                } else {
                    System.out.println("Congratulations! You are a winner!");
                    return;
                }
            }
            System.out.println("Sorry, try another time. Correct ans was: " + secretNum);
            System.out.println("Press Y to play again");
           // String ch = scanner.next();
            replay = scanner.next();
            scanner.close();
            System.out.println(replay.getClass().getName() + " " + replay);
            } while (replay.equalsIgnoreCase("Y"));
        }
    }


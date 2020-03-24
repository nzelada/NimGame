package NickZelada;

import java.util.*;
import NickZelada.Human;
import NickZelada.DumbComputer;
import NickZelada.Nim;
import NickZelada.SmartComputer;
import NickZelada.Pile;
import NickZelada.Player;

/**
 * This is the Test class, in which would create the game.
 *
 * @author Nick Zelada
 * @version October 10, 2018
 */
public class Test {

    /**
     * This test file would welcome the user to the game. From there it would
     * ask if they either wish to play first or second and in smart or dumb
     * mode. Once completing that the game would start in the terms they have
     * selected. Once the game is over, they can play again if they wish to.
     *
     * @param args
     */
    public static void main(String[] args) {
        System.out.println("Welcome To The Honorable Game of Nim!"); // String

        Player humanPlayer = (Player) new Human(); // Player Object
        Player dumbComputerPlayer = new DumbComputer(); // Player Object
        Player smartComputerPlayer = new SmartComputer(); // Player Object

        Scanner inputScan = new Scanner(System.in); // Scanner input
        String playAgain;

        do {
            System.out.println("Do you want to want to go First or Second? "
                    + "(Write First or Second)"); // Asking if user wants to go first or second
            String answer1 = inputScan.next();
            System.out.println(""); // new line

            System.out.println("Do you want to play with the Smart or Dumb "
                    + "computer? (Type Smart or Dumb)"); // Play in smart or dumb mode
            String answer2 = inputScan.next();
            System.out.println("");

            Nim nimGame = new Nim(); // Nim object

            if (answer1.equalsIgnoreCase("First")
                    && answer2.equalsIgnoreCase("Smart")) {
                nimGame.play(humanPlayer, smartComputerPlayer); // If this user puts first and wants to play smart mode, this would start.

            }
            if (answer1.equalsIgnoreCase("First")
                    && answer2.equalsIgnoreCase("Dumb")) {
                nimGame.play(humanPlayer, dumbComputerPlayer); // If this user puts first and wants to play dumb mode, this would start.

            }
            if (answer1.equalsIgnoreCase("Second")
                    && answer2.equalsIgnoreCase("Smart")) {
                nimGame.play(smartComputerPlayer, humanPlayer); // If this user puts second and wants to play smart mode, this would start.

            }
            if (answer1.equalsIgnoreCase("Second")
                    && answer2.equalsIgnoreCase("Dumb")) {
                nimGame.play(dumbComputerPlayer, humanPlayer); // If this user puts second and wants to play dumb mode, this would start.

            }

            System.out.println("");

            System.out.println("Do you want to play again? (Yes or No)"); // ask if they want to play again
            playAgain = inputScan.next();

            System.out.println("");

            if (playAgain.equalsIgnoreCase("No")) { // if no, it would pring a string.
                System.out.println("\nThanks for playing.");
            }

        } while (playAgain.equalsIgnoreCase("Yes")); // if yes playAgain would start

    }

}

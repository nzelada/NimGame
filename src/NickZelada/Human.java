package NickZelada;

import java.util.*;

/**
 * This is the human class, in which will allow a human to play.
 *
 * @author Nick Zelada
 * @version October 10, 2018
 */
public class Human implements Player {

    /**
     * Human constructor, nothing needed inside.
     */
    public Human() {

    }

    /**
     * String method would print and return a string.
     *
     * @return a string that says "Human Player"
     */
    public String toString() {
        return "Human Player";
    }

    /**
     * The move method would ask the the user to pick a number of marbles that
     * they wish to move from the legal number stated.
     *
     * @param marbles # of marbles
     * @return the number of move that the person wish to do
     */
    public int move(int marbles) {

        Scanner inputScan = new Scanner(System.in); // Scanner
        int move;

        System.out.println(this + ", remove 1 but no more than half of "
                + "the remaining marbles: ");
        move = inputScan.nextInt();


        while (move > marbles / 2 || move < 1) {
            System.out.println("Cheater! You've input an illegal number."
                    + " Please try again.\n");
            System.out.println("Remove 1 but no more than half of "
                    + "the remaining marbles: ");
            move = inputScan.nextInt();
        }

        System.out.println(""); 
        return move; //the legal number which they wish to move with

    }

}

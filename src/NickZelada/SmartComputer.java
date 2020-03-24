package NickZelada;

import java.util.*;

/**
 * This is the SmartComputer class, in which would create the SmartComputer.
 *
 * @author Nick Zelada
 * @version October 10, 2018
 */
public class SmartComputer implements Player {

    /**
     * This is the SmartComputer constructor and nothing is needed.
     */
    public SmartComputer() {

    }

    /**
     * This String method will print out "Smart Computer."
     *
     * @return Smart Computer
     */
    public String toString() {
        return "Smart Computer";
    }

    /**
     * This is the move method, in which it would get a number of marbles. From
     * there it would calculate the number of marbles removed from the pile
     * using the method
     *
     * @param marbles the number of marbles
     * @return move
     */
    public int move(int marbles) {
        int move = 0;

        if (marbles == 1 || marbles == 3 || marbles == 7 || marbles == 15
                || marbles == 31 || marbles == 63) {
            Random generator = new Random();
            move = generator.nextInt(marbles / 2) + 1;

        } else {

            int[] powers = {1, 3, 7, 15, 31, 63}; // power

            int i = powers.length - 1; // power - 1
            while (powers[i] > marbles) {
                i--;

            }

            move = marbles - powers[i]; // marbles - the power of the array

        }

        System.out.println(this + " has removed " + move
                + " marbles from the pile.\n");
        return move;
    }

}

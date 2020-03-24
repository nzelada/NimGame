package NickZelada;

import java.util.*;

/**
 * This is the DumbComputer class that would create the DumbComputer for the Nim
 * Game.
 *
 * @author Nick Zelada
 * @version October 10,2018
 */
public class DumbComputer implements Player {

    /**
     * DumbComputer constructor, nothing is needed inside of it.
     */
    public DumbComputer() {

    }

    /**
     * This String method will print and return a String.
     *
     * @return "Dumb Computer"
     */
    public String toString() {
        return "Dumb Computer";
    }

    /**
     * The move method would get the number of marbles and remove them from the
     * pile. It would also print out the number of marbles removed from the
     * pile.
     *
     * @param marbles the number of marbles
     * @return move 
     */
    public int move(int marbles) {
        Random generator = new Random();
        int move = generator.nextInt(marbles / 2) + 1;

        System.out.println(this + " has removed " + move
                + " marbles from the pile.\n");
        return move;
    }
}

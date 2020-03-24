package NickZelada;

import java.util.*;

/**
 * This is the Pile class, in which would make the pile.
 *
 * @author Nick Zelada
 * @version October 10, 2018
 */
public class Pile {

    private int marbles; // number of marbles in a pile

    /**
     * This is the pile constructor in which will make the marbles be random.
     */
    public Pile() {
        Random amount = new Random();
        marbles = amount.nextInt(91) + 10; // 0...90 + 10 = 100
    }

    /**
     * This method will get the marbles and then return it.
     *
     * @return marbles
     */
    public int getMarbles() {
        return marbles;
    }

    /**
     * This method will remove the marbles used and printing out a string that
     * would show the number of marbles left.
     *
     * @param remove it will get the number of marbles removed
     */
    public void removeMarbles(int remove) {
        marbles = marbles - remove;
        System.out.println("There are " + marbles + " marbles left.");
    }
}

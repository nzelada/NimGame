package NickZelada;

import java.util.*;

/**
 * This is the Nim class, this class will create the name game and see if the
 * person wins or not. It will also determine how many marbles are in the pile
 * left.
 *
 * @author Nick Zelada
 * @version October 11, 2018
 */
public class Nim {

    private Pile marblePile; //the pile of marbles

    /**
     * This is the Nim constructor
     */
    public Nim() {
        marblePile = new Pile();

    }

    /**
     * In this method, the game would start and tell the user who they are
     * playing against with. From there they would see how many marbles are in
     * the pile. Also who is the user and who picked up the last marble.
     *
     * @param player1 the first player
     * @param player2 the second player
     */
    public void play(Player player1, Player player2) {
        System.out.println("***Game has started***\n");

        System.out.println(player1 + " VS " + player2 + "\n\n");

        int play;

        System.out.println("There are " + marblePile.getMarbles()
                + " marbles in the pile.");

        do {

            play = player1.move(marblePile.getMarbles());
            marblePile.removeMarbles(play); // calls the removeMarbles method from pile

            if (marblePile.getMarbles() == 1) { // it's winner if the # is equal to 1
                System.out.println(player1 + " is the winner!");
                System.out.println(player2 + " pick up the last marble!");
                break;
            }

            play = player2.move(marblePile.getMarbles());
            marblePile.removeMarbles(play);

            if (marblePile.getMarbles() == 1) {
                System.out.println(player2 + " is the winner!");
                System.out.println(player1 + " pick up the last marble!");

            }

        } while (marblePile.getMarbles() > 0); // if the number of marbles is larger then 0,
        // the game is still on.
    }

}

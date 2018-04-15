package view;

import model.*;

public class Jury {

    public void sayResult(Move move1, Move move2) {
        System.out.println("The Player1 move: " + move1.getName());
        System.out.println("The Computer move: " + move2.getName());

        if (move1.defeats(move2)) {
            System.out.println("Player1 wins");
            return;
        }
        if (move2.defeats(move1)) {
            System.out.println("Computer wins");
            return;
        }
        System.out.println("Draw");
    }
}

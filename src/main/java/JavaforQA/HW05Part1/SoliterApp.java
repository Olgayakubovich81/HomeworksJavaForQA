package JavaforQA.HW05Part1;

import java.util.ArrayList;
import java.util.List;

public class SoliterApp {

    public static void main(String[] args) {
        Deck deck = new Deck();
        List<Card> tableau = new ArrayList<>();

        // Deal cards to the tableau
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < i + 1; j++) {
                tableau.add(deck.drawCard());
            }
        }

        // Display cards on the tableau
        int index = 0;
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < i + 1; j++) {
                Card card = tableau.get(index++);
                System.out.print(card + "  ");
            }
            System.out.println();
        }
    }
}

package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Game game = new Game();


        List<Card> drawnHand = new ArrayList<>();
        /*
        drawnHand.add(0, new Card("10", "Hearts"));
        drawnHand.add(1, new Card("10", "Clubs"));
        drawnHand.add(2, new Card("10", "Diamonds"));
        drawnHand.add(3, new Card("Jack", "Clubs"));
        drawnHand.add(4, new Card("Jack", "Diamonds"));
        System.out.println(game.FullHouse(drawnHand));
        */


        /*
        // for flush
        drawnHand.add(0, new Card("2", "Diamonds"));
        drawnHand.add(1, new Card("5", "Diamonds"));
        drawnHand.add(2, new Card("7", "Diamonds"));
        drawnHand.add(3, new Card("Jack", "Diamonds"));
        drawnHand.add(4, new Card("King", "Diamonds"));
        */


        // for 4 of a kind
        drawnHand.add(0, new Card("Queen", "Spades"));
        drawnHand.add(1, new Card("Queen", "Hearts"));
        drawnHand.add(2, new Card("Queen", "Clubs"));
        drawnHand.add(3, new Card("Queen", "Diamonds"));
        drawnHand.add(4, new Card("3","Hearts"));
        System.out.println(game.FourKind(drawnHand));

        Card card = new Card("10", "Hearts");
        card.Main();
        //System.out.println("Hello world!");
    }
}
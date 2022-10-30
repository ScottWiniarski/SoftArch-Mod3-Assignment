package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Game game = new Game();
        ArrayList<Card> drawnHand = new ArrayList<>();

        /*
        drawnHand.add(new Card("10", Suit.Clubs ));
        drawnHand.add(new Card("Jack", Suit.Diamonds ));
        drawnHand.add(new Card("10", Suit.Hearts ));
        drawnHand.add(new Card("10", Suit.Spades ));
        drawnHand.add(new Card("Jack", Suit.Spades ));
        System.out.println(game.FullHouse(drawnHand));
        drawnHand.clear();

         */
        drawnHand.add(new Card("2", Suit.Diamonds));
        drawnHand.add(new Card("5", Suit.Diamonds));
        drawnHand.add(new Card("7", Suit.Diamonds));
        drawnHand.add(new Card("Jack", Suit.Diamonds));
        drawnHand.add(new Card("King", Suit.Diamonds));
        System.out.println(game.Flush(drawnHand));
        drawnHand.clear();
        /*
        drawnHand.add(new Card("10", "Clubs"));
        drawnHand.add(new Card("Jack", "Diamond"));
        drawnHand.add(new Card("10", "Hearts"));
        drawnHand.add(new Card("10", "Diamond"));
        drawnHand.add(new Card("Jack", "Hearts"));
        System.out.println(game.FullHouse(drawnHand));
        drawnHand.clear();

        // for flush
        drawnHand.add( new Card("2", "Diamonds"));
        drawnHand.add( new Card("5", "Diamonds"));
        drawnHand.add( new Card("7", "Diamonds"));
        drawnHand.add( new Card("Jack", "Diamonds"));
        drawnHand.add( new Card("King", "Diamonds"));
        System.out.println(game.Flush(drawnHand));
        drawnHand.clear();

        // for 4 of a kind - works
        drawnHand.add( new Card("Queen", "Spades"));
        drawnHand.add( new Card("Queen", "Hearts"));
        drawnHand.add( new Card("Queen", "Clubs"));
        drawnHand.add( new Card("Queen", "Diamonds"));
        drawnHand.add( new Card("3","Hearts"));
        System.out.println("Is the hand a four of a kind?: " + game.FourKind(drawnHand));
        //System.out.println(game.FourKind(drawnHand));
        drawnHand.clear();


        // for 3 of a kind - works
        drawnHand.add( new Card("Queen", "Spades"));
        drawnHand.add( new Card("Jack", "Hearts"));
        drawnHand.add( new Card("Queen", "Clubs"));
        drawnHand.add( new Card("Queen", "Diamonds"));
        drawnHand.add( new Card("3","Hearts"));
        for(Card card : drawnHand){
            System.out.println(card.getFace() + card.getSuit());
        }
        System.out.println("Is the hand a three a kind?: " + game.ThreeKind(drawnHand));
        drawnHand.clear();

         */
    }
}
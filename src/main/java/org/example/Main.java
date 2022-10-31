package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Game game = new Game();
        ArrayList<Card> drawnHand = new ArrayList<>();

        //for fullhouse
        drawnHand.add(new Card("10", Suit.Clubs ));
        drawnHand.add(new Card("Jack", Suit.Diamonds ));
        drawnHand.add(new Card("10", Suit.Hearts ));
        drawnHand.add(new Card("10", Suit.Spades ));
        drawnHand.add(new Card("Jack", Suit.Spades ));
        System.out.println(game.FullHouse(drawnHand));
        drawnHand.clear();

        // for flush
        drawnHand.add( new Card("2", Suit.Diamonds));
        drawnHand.add( new Card("5", Suit.Diamonds));
        drawnHand.add( new Card("7", Suit.Diamonds));
        drawnHand.add( new Card("Jack", Suit.Diamonds));
        drawnHand.add( new Card("King", Suit.Diamonds));
        System.out.println(game.Flush(drawnHand));
        drawnHand.clear();

        // for 4 of a kind - works
        drawnHand.add( new Card("Queen", Suit.Clubs));
        drawnHand.add( new Card("Queen", Suit.Hearts));
        drawnHand.add( new Card("Queen", Suit.Clubs));
        drawnHand.add( new Card("Queen", Suit.Diamonds));
        drawnHand.add( new Card("3",Suit.Hearts));
        System.out.println("Is the hand a four of a kind?: " + game.FourKind(drawnHand));
        //System.out.println(game.FourKind(drawnHand));
        drawnHand.clear();


        // for 3 of a kind - works
        drawnHand.add( new Card("Queen", Suit.Spades));
        drawnHand.add( new Card("Jack", Suit.Hearts));
        drawnHand.add( new Card("Queen", Suit.Clubs));
        drawnHand.add( new Card("Queen", Suit.Diamonds));
        drawnHand.add( new Card("3",Suit.Hearts));
        for(Card card : drawnHand){
            System.out.println(card.getFace() + card.getSuit());
        }
        System.out.println("Is the hand a three a kind?: " + game.ThreeKind(drawnHand));
        drawnHand.clear();


    }
}
package org.example;

import java.util.ArrayList;
import java.util.List;

public class Game {

    // lookup what the actual poker hands are, use the getters and setters I just added.
    // consider using enums instead of actual strings for poker values
    //private List<Card> hand;
    private List<Card> fullhouse;
    private List<Card> flush;
    private List<Card> threeKind;
    private List<Card> fourKind;

    public boolean FullHouse(List<Card> givenHand){

        fullhouse = new ArrayList<>();
        fullhouse.add(0, new Card("10", "Hearts"));
        fullhouse.add(1, new Card("10", "Clubs"));
        fullhouse.add(2, new Card("10", "Diamonds"));
        fullhouse.add(3, new Card("Jack", "Clubs"));
        fullhouse.add(4, new Card("Jack", "Diamonds"));

        return fullhouse.stream().sorted() == givenHand.stream().sorted();
    }

    public boolean Flush(List<Card> givenHand){
        flush = new ArrayList<>();
        flush.add(0, new Card("2", "Diamonds"));
        flush.add(1, new Card("5", "Diamonds"));
        flush.add(2, new Card("7", "Diamonds"));
        flush.add(3, new Card("Jack", "Diamonds"));
        flush.add(4, new Card("King", "Diamonds"));

        return flush.stream().sorted() == givenHand.stream().sorted();
    }

    public boolean FourKind(List<Card> givenHand){
        fourKind = new ArrayList<>();
        fourKind.add(0, new Card("Queen", "Spades"));
        fourKind.add(1, new Card("Queen", "Hearts"));
        fourKind.add(2, new Card("Queen", "Clubs"));
        fourKind.add(3, new Card("Queen", "Diamonds"));

        int count = 0;
        for (Card card : givenHand)
        {
            for( Card card1 : fourKind)
            {
                if (card1.equals(card))
                {
                    count++;
                }
            }
        }

        return count == 4;
    }

    public boolean ThreeKind(List<Card> givenHand){

        threeKind = new ArrayList<>();
        threeKind.add(0, new Card("6", "Spades"));
        threeKind.add(0, new Card("6", "Hearts"));
        threeKind.add(0, new Card("6", "Clubs"));
        threeKind.add(0, new Card("6", "Diamonds"));

        int count = 0;
        for (Card card : givenHand)
        {
            for( Card card1 : threeKind)
            {
                if (card1.equals(card))
                {
                    count++;
                }
            }
        }

        return count == 3;
    }
}

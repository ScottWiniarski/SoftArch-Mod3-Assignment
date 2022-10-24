package org.example;

import java.util.ArrayList;
import java.util.List;

public class Game {
    private List<Card> hand;
    private List<Card> fullhouse;

    public boolean FullHouse(List<Card> givenHand){

        fullhouse = new ArrayList<>();
        fullhouse.add(0, new Card("10", "Hearts"));
        fullhouse.add(1, new Card("10", "Clubs"));
        fullhouse.add(2, new Card("10", "Diamonds"));
        fullhouse.add(3, new Card("Jack", "Clubs"));
        fullhouse.add(4, new Card("Jack", "Diamonds"));

        hand = new ArrayList<>();
        hand.addAll(givenHand);

        if(hand == givenHand){
            return true;
        }
        else return false;
    }
}

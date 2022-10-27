package org.example;

import java.util.ArrayList;
import java.util.List;

public class Card {
    private String face;
    private String suit;
    private List<Card> fullhouse;
    private List<Card> hand;

    public Card(String face, String suit) {
        this.face = face;
        this.suit = suit;
    }

    public List<Card> Main(){
        fullhouse = new ArrayList<>();
        fullhouse.add(0, new Card("10", "Hearts"));
        fullhouse.add(1, new Card("10", "Clubs"));
        fullhouse.add(2, new Card("10", "Diamonds"));
        fullhouse.add(3, new Card("Jack", "Clubs"));
        fullhouse.add(4, new Card("Jack", "Diamonds"));

        return fullhouse;
    }

    public String getFace() {
        return face;
    }

    public void setFace(String face) {
        this.face = face;
    }

    public String getSuit() {
        return suit;
    }

    public void setSuit(String suit) {
        this.suit = suit;
    }
}

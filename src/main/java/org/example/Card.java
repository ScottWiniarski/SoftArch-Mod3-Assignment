package org.example;

import java.util.ArrayList;
import java.util.List;

public class Card {
    private String face;
    //private String suit;
    private Suit suit;

    public Card(String face, Suit suit) {
        this.face = face;
        this.suit = suit;
    }

    public String getFace() {
        return face;
    }

    public void setFace(String face) {
        this.face = face;
    }

    public Suit getSuit() {
        return suit;
    }

    public void setSuit(Suit suit) {
        this.suit = suit;
    }
}

package org.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.DisabledIfSystemProperties;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class GameTest {

    @Test
    @DisplayName("Confirms if Fullhouse is present")
    void FullHouse() {
        Game game = new Game();
        ArrayList<Card> fullHouse = new ArrayList<>();
        fullHouse.add(new Card("10", Suit.Clubs ));
        fullHouse.add(new Card("Jack", Suit.Diamonds ));
        fullHouse.add(new Card("10", Suit.Hearts ));
        fullHouse.add(new Card("10", Suit.Spades ));
        fullHouse.add(new Card("Jack", Suit.Spades ));
        assertTrue(game.FullHouse(fullHouse));
    }

    @Test
    @DisplayName("Confirms if a Flush is present")
    void Flush(){
        // create a new hand, the same as what's in Main
        Game game = new Game();
        ArrayList<Card> hand = new ArrayList<>();
        hand.add(new Card("2", Suit.Diamonds));
        hand.add(new Card("5", Suit.Diamonds));
        hand.add(new Card("7", Suit.Diamonds));
        hand.add(new Card("Jack", Suit.Diamonds));
        hand.add(new Card("King", Suit.Diamonds));

        // game.Flush's method, pass it the created hand above, if true assertTrue returns true.
        assertTrue(game.Flush(hand));
    }

    @Test
    @DisplayName("Confirms if Four of A kind is true.")
    void FourKind(){
        Game game = new Game();
        ArrayList<Card> hand = new ArrayList<>();
        hand.add( new Card("Queen", Suit.Clubs));
        hand.add( new Card("Queen", Suit.Hearts));
        hand.add( new Card("Queen", Suit.Clubs));
        hand.add( new Card("Queen", Suit.Diamonds));
        hand.add( new Card("3",Suit.Hearts));

        assertTrue(game.FourKind(hand));
    }

    @Test
    @DisplayName("Confirms if three of a kind is present")
    void ThreeKind(){
        Game game = new Game();
        ArrayList<Card> hand = new ArrayList<>();

        hand.add( new Card("Queen", Suit.Spades));
        hand.add( new Card("Jack", Suit.Hearts));
        hand.add( new Card("Queen", Suit.Clubs));
        hand.add( new Card("Queen", Suit.Diamonds));
        hand.add( new Card("3",Suit.Hearts));

        assertTrue(game.ThreeKind(hand));
    }
}
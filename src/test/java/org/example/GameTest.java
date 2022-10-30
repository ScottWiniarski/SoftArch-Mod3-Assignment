package org.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.DisabledIfSystemProperties;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class GameTest {

    @Test
    void CaseyBoi()
    {
        Game game = new Game();
        ArrayList<Card> hand = new ArrayList<>();
        hand.add(new Card("2", Suit.Diamonds));
        hand.add(new Card("5", Suit.Diamonds));
        hand.add(new Card("7", Suit.Diamonds));
        hand.add(new Card("Jack", Suit.Diamonds));
        hand.add(new Card("King", Suit.Diamonds));
        hand.add(new Card("King", Suit.Diamonds));
        hand.add(new Card("King", Suit.Diamonds));
        hand.add(new Card("King", Suit.Diamonds));
        assertTrue(game.Flush(hand));


        hand = new ArrayList<>();
        hand.add(new Card("2", Suit.Diamonds));
        hand.add(new Card("5", Suit.Diamonds));
        hand.add(new Card("7", Suit.Hearts));
        hand.add(new Card("Jack", Suit.Diamonds));
        hand.add(new Card("King", Suit.Diamonds));
        assertFalse(game.Flush(hand));
    }

    @Test
    @DisplayName("Confirms if Fullhouse is present")
    void FullHouse() {
        assertAll();
    }

    @Test
    @DisplayName("Confirms if a Flush is present")
    void Flush(){
        assertAll();
    }

    @Test
    @DisplayName("Confirms if Four of A kind is true.")
    void FourKind(ArrayList<Card> givenHand, ArrayList<Card> drawnHand){
        assertAll(() -> assertEquals(givenHand,drawnHand));
    }

    @Test
    @DisplayName("Confirms if three of a kind is present")
    void ThreeKind(){
        assertAll();
    }
}
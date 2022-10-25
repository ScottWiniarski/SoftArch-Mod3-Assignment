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
        assertAll();
    }

    @Test
    @DisplayName("Confirms if a Flush is present")
    void Flush(){
        assertAll();
    }

    @Test
    @DisplayName("Confirms if Four of A kind is true.")
    void FourKind(List<Card> givenHand, List<Card> drawnHand){
        assertAll(() -> assertEquals(givenHand,drawnHand));
    }

    @Test
    @DisplayName("Confirms if three of a kind is present")
    void ThreeKind(){
        assertAll();
    }
}
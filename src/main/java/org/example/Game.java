package org.example;

import java.util.ArrayList;
import java.util.List;

public class Game {

    // lookup what the actual poker hands are, use the getters and setters I just added.
    // consider using enums instead of actual strings for poker values
    //private List<Card> hand;


    public boolean FullHouse(ArrayList<Card> givenHand) {
        String faceOne = "";
        int faceCountOne = 0;
        String faceTwo = "";
        int faceCountTwo = 0;

        for (Card card : givenHand) {
            if (faceOne.isEmpty()) {
                faceOne = card.getFace();
            }
            if (!card.getFace().equals(faceOne) && faceTwo.isEmpty()) {
                faceTwo = card.getFace();
            }

            if (card.getFace().equals(faceOne)) {
                faceCountOne++;
            } else if (card.getFace().equals(faceTwo)) {
                faceCountTwo++;
            }
        }
        return faceCountOne == 3 && faceCountTwo == 2;
    }
    public boolean Flush(ArrayList<Card> givenHand) {

        Suit suit = givenHand.get(0).getSuit();
        int count = 0;
        for (Card card : givenHand) {
            if (card.getSuit().equals(suit)) {
                count++;
            }
        }
        return count == 5;
    }

    public boolean FourKind(ArrayList<Card> givenHand) {

        String faceOne = givenHand.get(0).getFace();
        int countOne = 0;
        String faceTwo = givenHand.get(1).getFace();
        int countTwo = 0;
        String faceThree = givenHand.get(2).getFace();
        int countThree = 0;
        String faceFour = givenHand.get(3).getFace();
        int countFour = 0;
        String faceFive = givenHand.get(4).getFace();
        int countFive = 0;

        for (Card card : givenHand) {
            if (card.getFace().equals(faceOne)) {
                countOne++;
            } else if (card.getFace().equals(faceTwo)) {
                countTwo++;
            } else if (card.getFace().equals(faceThree)) {
                countThree++;
            } else if (card.getFace().equals(faceFour)) {
                countFour++;
            } else if (card.getFace().equals(faceFive)) {
                countFive++;
            }
        }
        return countOne == 4 || countTwo == 4 || countThree == 4 || countFour == 4 || countFive == 4;
    }

    public boolean ThreeKind(ArrayList<Card> givenHand) {

        String faceOne = givenHand.get(0).getFace();
        int countOne = 0;
        String faceTwo = givenHand.get(1).getFace();
        int countTwo = 0;
        String faceThree = givenHand.get(2).getFace();
        int countThree = 0;
        String faceFour = givenHand.get(3).getFace();
        int countFour = 0;
        String faceFive = givenHand.get(4).getFace();
        int countFive = 0;

        for (Card card : givenHand) {
            if (card.getFace().equals(faceOne)) {
                countOne++;
            } else if (card.getFace().equals(faceTwo)) {
                countTwo++;
            } else if (card.getFace().equals(faceThree)) {
                countThree++;
            } else if (card.getFace().equals(faceFour)) {
                countFour++;
            } else if (card.getFace().equals(faceFive)) {
                countFive++;
            }
        }
        return countOne == 3 || countTwo == 3 || countThree == 3 || countFour == 3 || countFive == 3;
    }
}

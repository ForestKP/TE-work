package com.techelevator;

public class Program {
    public static void main(String[] args) {

        Card myCard = new Card("Spades", "8");

        Deck testDeck = new Deck();
        Card dealtCard = testDeck.dealOne();

        //myCard.setSuit("Hearts");

    }
}

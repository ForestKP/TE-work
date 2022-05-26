package com.techelevator;

public class Card {

    //class variables/instance attributes
    private boolean isFaceUp = true;
    private String suit;
    private int scoreValue;
    private String faceValue;

    //Constructor
    public Card(String suit, String faceValue) {
        this.suit = suit;
        this.faceValue = faceValue;
        this.isFaceUp = false;
    }

    public boolean isFaceUp() {
        return isFaceUp;
    }

    public boolean flip() {
        isFaceUp = !isFaceUp;
        return isFaceUp;
    }

    //getter
    public String getSuit() {
        return suit;
    }

    public int getScoreValue() {
        return scoreValue;
    }

    public void setScoreValue(int scoreValue) {
        this.scoreValue = scoreValue;
    }

    public String getFaceValue() {
        return faceValue;
    }

}

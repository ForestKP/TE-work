package com.techelevator;

import java.util.ArrayList;
import java.util.List;

public class Deck {

    //attributes/variables
    private List<Card> cards = new ArrayList<Card>();

    private static String[] suits = { "SPADES", "DIAMONDS", "CLUBS", "HEARTS" };
    private static String[] faceValues = {"2","3","4","5","6","7","8","9","10","J","Q","K","A"};

    //Constructor
    public Deck() {


        for(String suit : suits) {
            for(String faceValue : faceValues) {
                cards.add(new Card(suit, faceValue));
            }
        }

    }

    //methods/behaviors

    public Card dealOne() {
        if(cards.size() > 0) {
            return cards.remove(0);
        }
        return null;
    }



}

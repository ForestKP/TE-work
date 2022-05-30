package com.techelevator;

public class FruitTree {

    // attributes
     int piecesOfFruitLeft;
     String typeOfFruit ="";

//constructor

    public FruitTree(int piecesOfFruitLeft,String typeOfFruit){
        this.piecesOfFruitLeft = piecesOfFruitLeft;
        this.typeOfFruit =typeOfFruit;

    }
//derived attribute
    public boolean pickFruit(int numberOfPiecesToRemove){

                if(piecesOfFruitLeft >= numberOfPiecesToRemove){
                    piecesOfFruitLeft -= numberOfPiecesToRemove;
                    return true;
                }
                return false;
    }

// getter and setter

public int getPiecesOfFruitLeft() {
    return piecesOfFruitLeft;
}

    public String getTypeOfFruit() {
        return typeOfFruit;
    }




}

package com.techelevator;

import org.junit.Assert;
import org.junit.Test;

public class Lucky13Test {

    //test case array contains 1
    @Test
    public void lucky13_contains_1() {
        //arrange
        Lucky13 testLucky13 = new Lucky13();

        //act
        int[] luckyNumberArray = new int[] { 1, 5, 6 };
        Boolean isLucky13 = testLucky13.getLucky(luckyNumberArray);

        //assert
        Assert.assertEquals("Array contains 1 expected 'false'", false, isLucky13);
    }



}

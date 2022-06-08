package com.techelevator;

import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class WordCountTest {
    // if the word null
    // if it wa empty

    @Test
    public void wordCount_in_map_get_expected_value() {
        //arrange
        WordCount wordCount = new WordCount();

        //act
        Map<String, Integer> output = new <>();
        String wordkey = wordCount.getCount("");

        //assert
        Assert.assertEquals(" '' expected ''", "", wordkey);

    }


}

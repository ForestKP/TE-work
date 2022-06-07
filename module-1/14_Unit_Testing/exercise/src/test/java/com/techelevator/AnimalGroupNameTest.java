package com.techelevator;

import org.junit.Assert;
import org.junit.Test;

public class AnimalGroupNameTest {

    //test case 1 we get and amimal that's in the map so we return the value


    @Test
    public void animalName_in_map_get_expected_value(){
    //arrange
    AnimalGroupName animalGroup = new AnimalGroupName();
    //act
    String herdName = animalGroup.getHerd("giraffe");
    //assert
    Assert.assertEquals("Animal name 'giraffe' expected 'Tower'", "Tower", herdName);

}

    //test case 2 get an animal not in the map, return "unknown"



    // test case animal name is there but gets mixed case, return the value


    // test case 4 animal is null, return "unknown"



    // test case 5 animal name is "", return "unkn  own"

}

package com.techelevator;

import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;


@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class AnimalGroupNameTest {

    //test case 1 we get and amimal that's in the map so we return the value

    @Test
    public void animalName_in_map_get_expected_value() {
        //arrange
        AnimalGroupName animalGroup = new AnimalGroupName();
        //act
        String herdName = animalGroup.getHerd("giraffe");
        //assert
        Assert.assertEquals("Animal name 'giraffe' expected 'Tower'", "Tower", herdName);

    }

    //test case 2 get an animal not in the map, return "unknown"
    @Test
    public void animalName_is_not_in_map() {
        //arrange
        AnimalGroupName animalGroup = new AnimalGroupName();
        //act
        String herdName = animalGroup.getHerd("penguin");
        //assert
        Assert.assertEquals("Animal name 'penguin' expected 'unknown'", "unknown", herdName);
    }

        // test case animal name is there but gets mixed case, return the value
        @Test
        public void animalName_in_map_mixed_case_expected_value() {
            //arrange
            AnimalGroupName animalGroup = new AnimalGroupName();
            //act
            String herdName = animalGroup.getHerd("GiraFfE");
            //assert
            Assert.assertEquals("Animal name 'GiraFfE' expected 'Tower'", "Tower", herdName);
        }

        // test case 4 animal is null, return "unknown"
        @Test
        public void animalName_null_expect_unknown(){
        AnimalGroupName animalGroup = new AnimalGroupName();
        String herdName = animalGroup.getHerd( null);
        Assert.assertEquals( "unknown", herdName);
        }

        // test case 5 animal name is "", return "unkn  own"
        @Test
        public void animalName_empty_string_expect_unknown(){
            AnimalGroupName animalGroup = new AnimalGroupName();
            String herdName = animalGroup.getHerd( "");
            Assert.assertEquals( "unknown", herdName);
        }

}

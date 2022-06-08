package com.techelevator;

import org.junit.Assert;
import org.junit.Test;

public class CigarTest {
    // weekend true/ 40- no limit = true
    @Test
    public void cigar_Party_was_successful_On_Weekend() {
        //arrange
        CigarParty cigarparty = new CigarParty();
        //act
        boolean isPartyhappening = cigarparty.haveParty(40, true);
        //assert
        Assert.assertEquals("have party", true, isPartyhappening);
    }
    //weekday true 40-60 = true
    @Test
    public void cigar_Party_was_successful_On_Weekday() {
        //arrange
        CigarParty cigarparty = new CigarParty();
        //act
        boolean isPartyhappening = cigarparty.haveParty(40, false);
        //assert
        Assert.assertEquals("have party", true, isPartyhappening);
    }
    //weekday true <40 = false
    @Test
    public void cigar_Party_was_Not_successful_On_Weekday() {
        //arrange
        CigarParty cigarparty = new CigarParty();
        //act
        boolean isPartyhappening = cigarparty.haveParty(39, false);
        //assert
        Assert.assertEquals("Don't have party", false, isPartyhappening);
    }
    //weekday >60 = false
    @Test
    public void cigar_Party_Had_too_Many_Cigars_Weekday() {
        //arrange
        CigarParty cigarparty = new CigarParty();
        //act
        boolean isPartyhappening = cigarparty.haveParty(61, false);
        //assert
        Assert.assertEquals("Don't have party", false, isPartyhappening);
    }
   // weekend <40 = false
   @Test
   public void cigar_Party_Had_too_Few_Cigars_Weekend() {
       //arrange
       CigarParty cigarparty = new CigarParty();
       //act
       boolean isPartyhappening = cigarparty.haveParty(39, true);
       //assert
       Assert.assertEquals("Don't have party", false, isPartyhappening);
   }
    // weekend >60 = true
    @Test
    public void cigar_Party_Had_too_Many_Cigars_Weekend() {
        //arrange
        CigarParty cigarparty = new CigarParty();
        //act
        boolean isPartyhappening = cigarparty.haveParty(61, true);
        //assert
        Assert.assertEquals("have party", true, isPartyhappening);
    }
}

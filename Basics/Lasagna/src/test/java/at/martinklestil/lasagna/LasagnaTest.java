package at.martinklestil.lasagna;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LasagnaTest {
    private Lasagna lasagna = new Lasagna();

    @Test
    void expect40MinForLasagna(){
        //First Test, expect 40
        assertEquals(40, lasagna.expectedMinutesInOven());
    }

    @Test
    void expectNot200temp() {
        //expect not 200
        assertNotEquals(200, lasagna.topAndBottomHeat());
    }

    @Test
    void expect10RemainingMinutesInOven(){
        assertEquals(10, lasagna.remainingMinutesInOven(30));
    }

    @Test
    void expectTrue(){
        //Test of boolean true
        assertTrue(lasagna.pumpkinLasagna());
    }

    @Test
    void expect4When2StartValue(){
        assertEquals(4, lasagna.preparationTimeInMinutes(2));
    }

    @Test
    void expect8When4StartValue(){
        //Several test scenarios to find problems
        assertEquals(8, lasagna.preparationTimeInMinutes(4));
    }

    @Test
    void expect32totalTimeBy1and30() {
        assertEquals(32, lasagna.totalTimeInMinutes(1,30));
    }


}
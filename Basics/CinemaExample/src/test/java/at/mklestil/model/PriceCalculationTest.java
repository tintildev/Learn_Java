package at.mklestil.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PriceCalculationTest {

    @Test
    public void testCinema1Seat1() {
        PriceCalculation priceCalculation = new PriceCalculation(1, 5, 1, 1);
        assertEquals(19.0, priceCalculation.price(), 0.01);
    }

    @Test
    public void testCinema1Seat2() {
        PriceCalculation priceCalculation = new PriceCalculation(1, 5, 2, 1);
        assertEquals(29.5, priceCalculation.price(), 0.01);
    }

    @Test
    public void testCinema2Seat1Weekday() {
        PriceCalculation priceCalculation = new PriceCalculation(2, 7, 1, 3);
        assertEquals(23.1, priceCalculation.price(), 0.01);
    }

    @Test
    public void testCinema2Seat1Weekend() {
        PriceCalculation priceCalculation = new PriceCalculation(2, 5, 1, 6);
        assertEquals(22.5, priceCalculation.price(), 0.01);
    }

    @Test
    public void testCinema2Seat2() {
        PriceCalculation priceCalculation = new PriceCalculation(2, 5, 2, 1);
        assertEquals(35.0, priceCalculation.price(), 0.01);
    }

    @Test
    public void testCinema3Weekday() {
        PriceCalculation priceCalculation = new PriceCalculation(3, 5, 1, 4);
        assertEquals(30.0, priceCalculation.price(), 0.01);
    }

    @Test
    public void testCinema3Weekend() {
        PriceCalculation priceCalculation = new PriceCalculation(3, 5, 1, 7);
        assertEquals(37.5, priceCalculation.price(), 0.01);
    }

}
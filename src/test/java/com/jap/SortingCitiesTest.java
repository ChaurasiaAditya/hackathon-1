package com.jap;


import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class SortingCitiesTest {
    SortingCities sortingCities;
    int[] distanceFromZurich;
    String[] cityNames;

    @BeforeEach
    public void setUp() {
        sortingCities = new SortingCities();
        distanceFromZurich = new int[]{138, 52, 118, 136, 85, 276, 103, 87, 214, 101};
        cityNames = new String[]{"Bern", "Lucerne", "Interlaken", "Grindelwald", "Engelberg", "Geneva", "Murren", "Basel", "Zermatt", "Jungfraujoch"};
    }

    @AfterEach
    public void tearDown() {
    }

    @Test
    void checkArrangeCitiesInAlphabeticOrderSuccess() {
        // act
        String[] expected = {"Bern", "Basel", "Engelberg", "Grindelwald", "Geneva", "Interlaken", "Jungfraujoch", "Lucerne", "Murren", "Zermatt"};
        // Assert
        Assertions.assertEquals(expected[0], sortingCities.arrangedCities(cityNames)[0]);
        Assertions.assertEquals(expected[1], sortingCities.arrangedCities(cityNames)[1]);
        Assertions.assertEquals(expected[2], sortingCities.arrangedCities(cityNames)[2]);
        Assertions.assertEquals(expected[3], sortingCities.arrangedCities(cityNames)[3]);
        Assertions.assertEquals(expected[4], sortingCities.arrangedCities(cityNames)[4]);
        Assertions.assertEquals(expected[5], sortingCities.arrangedCities(cityNames)[5]);
    }

}
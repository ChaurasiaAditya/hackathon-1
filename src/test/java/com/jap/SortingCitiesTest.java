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

    @Test
    void checkArrangeCitiesInAlphabeticOrderFailure() {
        // act
        String[] expected = {"Bern", "Basel", "Engelberg", "Grindelwald", "Geneva", "Interlaken", "Jungfraujoch", "Lucerne", "Murren", "Zermatt"};
        // Assert
        Assertions.assertNotEquals(expected[0], sortingCities.arrangedCities(cityNames)[1]);
        Assertions.assertNotEquals(expected[0], sortingCities.arrangedCities(cityNames)[2]);
        Assertions.assertNotEquals(expected[0], sortingCities.arrangedCities(cityNames)[3]);
        Assertions.assertNotEquals(expected[0], sortingCities.arrangedCities(cityNames)[4]);
        Assertions.assertNotEquals(expected[0], sortingCities.arrangedCities(cityNames)[5]);
        Assertions.assertNotEquals(expected[0], sortingCities.arrangedCities(cityNames)[6]);
    }

    @Test
    void givenIntegerArrayCheckInAscendingOrderSuccess() {
        // act
        int[] expectedOrder = {52, 85, 87, 101, 103, 118, 136, 138, 214, 276};
        // Assert
        Assertions.assertEquals(expectedOrder[0], sortingCities.arrangedDistances(distanceFromZurich)[0]);
        Assertions.assertEquals(expectedOrder[1], sortingCities.arrangedDistances(distanceFromZurich)[1]);
        Assertions.assertEquals(expectedOrder[2], sortingCities.arrangedDistances(distanceFromZurich)[2]);
        Assertions.assertEquals(expectedOrder[3], sortingCities.arrangedDistances(distanceFromZurich)[3]);
        Assertions.assertEquals(expectedOrder[4], sortingCities.arrangedDistances(distanceFromZurich)[4]);
        Assertions.assertEquals(expectedOrder[5], sortingCities.arrangedDistances(distanceFromZurich)[5]);
        Assertions.assertEquals(expectedOrder[6], sortingCities.arrangedDistances(distanceFromZurich)[6]);
        Assertions.assertEquals(expectedOrder[7], sortingCities.arrangedDistances(distanceFromZurich)[7]);

    }

    @Test
    void givenIntegerArrayCheckInAscendingOrderFailure() {
        // act
        int[] expectedOrder = {52, 85, 87, 101, 103, 118, 136, 138, 214, 276};
        // Assert
        Assertions.assertNotEquals(expectedOrder[0], sortingCities.arrangedDistances(distanceFromZurich)[1]);
        Assertions.assertNotEquals(expectedOrder[0], sortingCities.arrangedDistances(distanceFromZurich)[2]);
        Assertions.assertNotEquals(expectedOrder[1], sortingCities.arrangedDistances(distanceFromZurich)[5]);
        Assertions.assertNotEquals(expectedOrder[1], sortingCities.arrangedDistances(distanceFromZurich)[4]);
        Assertions.assertNotEquals(expectedOrder[2], sortingCities.arrangedDistances(distanceFromZurich)[6]);
        Assertions.assertNotEquals(expectedOrder[2], sortingCities.arrangedDistances(distanceFromZurich)[3]);
        Assertions.assertNotEquals(expectedOrder[0], sortingCities.arrangedDistances(distanceFromZurich)[4]);
        Assertions.assertNotEquals(expectedOrder[0], sortingCities.arrangedDistances(distanceFromZurich)[3]);
    }


    @Test
    void givenStringNameConvertToUpperCaseSuccess() {
        Assertions.assertEquals("BERN", sortingCities.toUpperCase(cityNames[0]));
        Assertions.assertEquals("LUCERNE", sortingCities.toUpperCase(cityNames[1]));
        Assertions.assertEquals("GENEVA", sortingCities.toUpperCase(cityNames[5]));
    }
}
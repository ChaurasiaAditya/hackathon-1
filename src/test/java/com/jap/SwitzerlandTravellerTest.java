package com.jap;


import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class SwitzerlandTravellerTest {
    SwitzerlandTraveller sortingCities;
    int[] distanceFromZurich;
    String[] cityNames;

    @BeforeEach
    public void setUp() {
        sortingCities = new SwitzerlandTraveller();
        distanceFromZurich = new int[]{138, 52, 118, 136, 85, 276, 103, 87, 214, 101};
        cityNames = new String[]{"Bern", "Lucerne", "Interlaken", "Grindelwald", "Engelberg", "Geneva", "Murren", "Basel", "Zermatt", "Jungfraujoch"};
    }

    @AfterEach
    public void tearDown() {
    }

    @Test
    public void checkArrangeCitiesInAlphabeticOrderSuccess() {
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
    public void checkArrangeCitiesInAlphabeticOrderFailure() {
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
    public void givenIntegerArrayCheckInAscendingOrderSuccess() {
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
    public void givenIntegerArrayCheckInAscendingOrderFailure() {
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
    public void givenStringNameConvertToUpperCaseSuccess() {
        Assertions.assertEquals("BERN", sortingCities.toUpperCase(cityNames[0]));
        Assertions.assertEquals("LUCERNE", sortingCities.toUpperCase(cityNames[1]));
        Assertions.assertEquals("GENEVA", sortingCities.toUpperCase(cityNames[5]));
    }

    @Test
    public void givenStringNameConvertToUpperCaseFailure() {
        Assertions.assertNotEquals("Bern", sortingCities.toUpperCase(cityNames[0]));
        Assertions.assertNotEquals("Lucerne", sortingCities.toUpperCase(cityNames[1]));
        Assertions.assertNotEquals("Geneva", sortingCities.toUpperCase(cityNames[5]));
        Assertions.assertNotEquals("Murren", sortingCities.toUpperCase(cityNames[3]));
    }

    @Test
    public void findCityWhichIs52KmsFromZurichSuccess() {
        Assertions.assertEquals("Lucerne", sortingCities.cityAt52KmsFromZurich(distanceFromZurich, cityNames));
    }

    @Test
    public void findCityWhichIs52KmsFromZurichFailure() {
        Assertions.assertNotEquals("Geneva", sortingCities.cityAt52KmsFromZurich(distanceFromZurich, cityNames));
        Assertions.assertNotEquals("Bern", sortingCities.cityAt52KmsFromZurich(distanceFromZurich, cityNames));
        Assertions.assertNotEquals("Murren", sortingCities.cityAt52KmsFromZurich(distanceFromZurich, cityNames));
    }

    @Test
    public void cityGreaterThan270KmsFromZurichSuccess() {
        Assertions.assertEquals("Geneva", sortingCities.cityGreaterThan270KmsFromZurich(distanceFromZurich, cityNames));
    }

    @Test
    public void cityGreaterThan270KmsFromZurichFailure() {
        Assertions.assertNotEquals("Lucerne", sortingCities.cityGreaterThan270KmsFromZurich(distanceFromZurich, cityNames));
        Assertions.assertNotEquals("Bern", sortingCities.cityGreaterThan270KmsFromZurich(distanceFromZurich, cityNames));
        Assertions.assertNotEquals("Murren", sortingCities.cityGreaterThan270KmsFromZurich(distanceFromZurich, cityNames));
    }
}
package com.jap;

/**
 * Hello world!
 */
public class SortingCities {
    public static void main(String[] args) {
        System.out.println("Hello World!");
    }

    /**
     * The function takes an array of integers as an argument and returns the same array with the integers sorted in
     * ascending order
     *
     * @param distances The array of distances from Zurich.
     * @return The method is returning the array of distances from Zurich.
     */
    public int[] arrangedDistances(int[] distances) {
        // Loop to iterate every Distance in Array
        for (int pass = 0; pass < distances.length; pass++) {
            for (int index = 0; index < distances.length - 1; index++) {

                // Check if the distance is less Swap
                if (distances[index] > distances[index + 1]) {

                    // Swap the distance in Ascending Order
                    int temporary = distances[index];
                    distances[index] = distances[index + 1];
                    distances[index + 1] = temporary;
                }
            }
        }
        return distances;
    }

    /**
     * The function takes an array of strings as an argument and returns an array of strings in alphabetical order
     *
     * @param citiesNames The array of cities names.
     * @return The method is returning the citiesNames array.
     */
    public String[] arrangedCities(String[] citiesNames) {

        // Loop to iterate every city Names in Array
        for (int pass = 0; pass < citiesNames.length; pass++) {
            for (int index = 0; index < citiesNames.length - 1; index++) {
                if (citiesNames[index].charAt(0) > citiesNames[index + 1].charAt(0)) {

                    // Swap the City Names in Alphabetic Order
                    String temporaryName = citiesNames[index];
                    citiesNames[index] = citiesNames[index + 1];
                    citiesNames[index + 1] = temporaryName;
                }
            }
        }
        return citiesNames;
    }

    /**
     * This function takes a string and returns a string.
     *
     * @param citiesNames This is the parameter that is passed to the method.
     * @return The citiesNames is being returned in upper case.
     */
    public String toUpperCase(String citiesNames) {
        return citiesNames.toUpperCase();
    }


}

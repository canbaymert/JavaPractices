package _20_map;

import java.util.HashMap;
import java.util.Map;

public class C05_printEntrySet {

    public static void main(String[] args) {
        HashMap<String, Integer> countryPopulations = new HashMap<>();
        countryPopulations.put("Germany", 80);
        countryPopulations.put("Turkey", 83);
        countryPopulations.put("USA", 250);
        countryPopulations.put("France", 68);
        countryPopulations.put("Canada", 40);

        System.out.println(countryPopulations);

        System.out.println("Countries : " + countryPopulations.keySet());

        System.out.println("Populations : " + countryPopulations.values());


        int counter = 0;
        for (Integer each : countryPopulations.values()) {
            if (each > 50) {
                counter++;
            }
        }

        System.out.println("Number of countries with more than 50 million population : " + counter);

        int totalPopulation = 0;
        for (Integer each : countryPopulations.values()
        ) {
            totalPopulation += each;

        }
        System.out.println("Total population of the given countries : " + totalPopulation);

        for (String each : countryPopulations.keySet()) {
            System.out.println(each);
        }
         /*
            Canada
            USA
            Turkey
            France
            Germany
         */

        for (Integer each : countryPopulations.values()) {
            System.out.println(each);
        }
         /*
            40
            250
            83
            68
            80
         */

        for (Map.Entry<String, Integer> each : countryPopulations.entrySet()) {
            System.out.println(each);
        }
         /*
            Canada=40
            USA=250
            Turkey=83
            France=68
            Germany=80
         */

        for (Map.Entry<String, Integer> each : countryPopulations.entrySet()) {
            System.out.println(each.getKey() + "*****" + each.getValue());
        }
        /*
        Canada*****40
        USA*****250
        Turkey*****83
        France*****68
        Germany*****80
        */
    }
}



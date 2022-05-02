package _20_map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class C06_zipCodes {
    public static void main(String[] args) {

        Map<Integer,String> zipcodes = new HashMap<>();
        zipcodes.put(85001, "Arizona");
        zipcodes.put(71601, "Arkansas");
        zipcodes.put(80001, "Colorado");

        Set<Integer> keys = zipcodes.keySet();

        for (Integer each: keys) {
            System.out.println(each + "=>" + zipcodes.get(each));
        }
        /*
        71601=>Arkansas
        80001=>Colorado
        85001=>Arizona
         */
    }
}


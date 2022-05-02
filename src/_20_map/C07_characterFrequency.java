package _20_map;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

import static java.util.Collections.frequency;

public class C07_characterFrequency {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a string : ");
        String str = scan.nextLine().toLowerCase();
        charFrequency(str);
    }

    public static void charFrequency(String str) {
        TreeMap<Character, Integer> frMap = new TreeMap<>();

        for (int i = 0; i < str.length(); i++) {
            if (frMap.containsKey(str.charAt(i))) {
                frMap.replace(str.charAt(i), frMap.get(str.charAt(i)) + 1);
            } else {
                frMap.put(str.charAt(i), 1);
            }
        }
        System.out.println(frMap);
    }
}




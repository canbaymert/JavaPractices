package _19_Set;

import java.util.Arrays;
import java.util.HashSet;

public class C01_methods {
    public static void main(String[] args) {
        // Mutable no need to assign

        HashSet<String> hs1 = new HashSet<>(Arrays.asList("banana", "melon", "strawberry", "kiwi"));
        hs1.add("apricot");
        System.out.println(hs1); // [banana, apricot, kiwi, strawberry, melon]

        HashSet<String> hs2 = new HashSet<>(Arrays.asList("watermelon", "blueberry", "raspberry"));

        hs1.addAll(hs2);
        System.out.println(hs1);// [banana, apricot, raspberry, kiwi, blueberry, strawberry, watermelon, melon]

        System.out.println(hs1.remove("apricot")); // true
        System.out.println(hs1);  // [banana, raspberry, kiwi, blueberry, strawberry, watermelon, melon]

        System.out.println(hs1.size());//7

        System.out.println(hs1.isEmpty());//false

        System.out.println(hs1.contains("watermelon")); // true
        System.out.println(hs1.retainAll(hs2)); // true

        hs2.clear();
        System.out.println(hs2); // []
    }
}


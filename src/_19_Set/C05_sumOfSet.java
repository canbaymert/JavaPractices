package _19_Set;

import java.util.HashSet;

public class C05_sumOfSet {
    public static void main(String[] args) {
        HashSet<Double> set = new HashSet<>();
        createSet(set);
        System.out.println(set);
        sumSet(set);
    }

    private static void sumSet(HashSet<Double> set) {
        Double sum = 0.0;
        for (Double each : set) {
            sum += each;
        }
        System.out.println(sum);
    }

    private static HashSet createSet(HashSet<Double> set) {
        set.add(3.23);
        set.add(3.10);
        set.add(5.12);
        set.add(10.12);
        set.add(23.12);
        return set;
    }
}


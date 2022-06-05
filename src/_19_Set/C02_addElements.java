package _19_Set;

import java.util.HashSet;

public class C02_addElements {
    public static void main(String[] args) {
        HashSet<Integer> hs = new HashSet<>();
        int[] arr = new int[]{1, 2, 3, 4, 5, 6, 7};
        addElement(hs, arr);
        System.out.println();
        addElement(hs, new int[]{34, 35, 45, 61, 38, 41});
    }

    private static void addElement(HashSet<Integer> hs, int[] arr) {
        for (Integer each : arr) {
            hs.add(each);
        }
        print(hs);
    }

    public static void print(HashSet<Integer> hs) {
        for (Integer x : hs) {
            System.out.print(x + " ");
        }
    }
}


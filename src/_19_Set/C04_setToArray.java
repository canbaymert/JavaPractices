package _19_Set;

import java.util.*;

public class C04_setToArray {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        randomSet(10, set);
        int[] arr;
        arr = setToArray(set);
        System.out.println("Set to Array = " + Arrays.toString(arr));
    }

    public static void randomSet(int size, Set<Integer> set) {
        Random rnd = new Random();
        while (set.size() < size) {
            set.add(rnd.nextInt(20));
        }
        System.out.println("Random set = " + set);
    }

    public static int[] setToArray(Set<Integer> set) {
        int[] arr = new int[set.size()];
        int counter = 0;
        for (int each : set
        ) {
            arr[counter] = each;
            counter++;
        }
        return arr;
    }
}



package _11_List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C08_ignoreRepetition {
    public static void main(String[] args) {


        Integer[] arr1 = {1, 2, 2, 3, 1, 4, 2, 5, 6, 8, 7, 5, 9, 1};
        System.out.println(Arrays.toString(arr1));
        List<Integer> arrayList = Arrays.asList(arr1);
        List<Integer> nonrepetitivelist = new ArrayList<>();

        for (Integer each : arrayList) {
            if (!nonrepetitivelist.contains(each)) {
                nonrepetitivelist.add(each);
            }
        }
        int[] Arr2 = new int[nonrepetitivelist.size()];
        for (int i = 0; i < nonrepetitivelist.size(); i++) {
            Arr2[i] = nonrepetitivelist.get(i);
        }
        System.out.println(Arrays.toString(Arr2));
    }
}


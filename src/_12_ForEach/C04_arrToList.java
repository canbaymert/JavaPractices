package _12_ForEach;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C04_arrToList {
    public static void main(String[] args) {
        int[] arr = {2, 5, 4, 6, 4, 9, 7, 1, 3, 10};
        System.out.println("Arr : " + Arrays.toString(arr));
        List<Integer> nums = new ArrayList<>();
        for (int each : arr
        ) {
            nums.add(each);
        }
        System.out.println("List : " + nums);
    }
}

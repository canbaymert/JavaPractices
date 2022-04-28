package _10_Arrays;

import java.util.Arrays;

public class C03_multipleWithMinusOne {
    public static void main(String[] args) {
        int[] Arr = {1, 2, -3, 4, -5, -6};
        int[] result = C03_multipleWithMinusOne(Arr);
        System.out.println(Arrays.toString(result));
    }

    private static int[] C03_multipleWithMinusOne(int[] Arr) {
        for (int i = 0; i < Arr.length; i++) {
            Arr[i] *= -1;
        }
        return Arr;
    }
}
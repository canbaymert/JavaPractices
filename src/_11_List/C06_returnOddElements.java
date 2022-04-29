package _11_List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class C06_returnOddElements {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] arr = new int[6];

        for (int i = 0; i < 6; i++) {
            System.out.print("Enter element number " + (i + 1) + " : ");
            arr[i] = scan.nextInt();
        }
        int[] arr2 = returnodd(arr);
        System.out.println(Arrays.toString(arr2));
    }

    public static int[] returnodd(int[] arr) {
        List<Integer> nums = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 1) nums.add(i);
        }
        int[] arrodd = new int[nums.size()];
        for (int i = 0; i < nums.size(); i++) {
            arrodd[i] = nums.get(i);
        }
        return arrodd;
    }
}
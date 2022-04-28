package _10_Arrays;

import java.util.Scanner;

public class C04_arrayCouple {
    // Find the array couples whose sum equals to desired number.
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the desired sum : ");
        int sum = scan.nextInt();
        int[] arr = {5, 7, -6, 4, 2, 15, 3, 8, 1};
        arraycouple(arr, sum);

    }

    private static void arraycouple(int[] Arr, int sum) {
        for (int i = 0; i < Arr.length; i++) {
            for (int j = 0; j < Arr.length; j++) {
                if (i != j) {
                    if (Arr[i] + Arr[j] == sum) System.out.println("(" + Arr[i] + "," + Arr[j] + ")");
                }
            }
        }
    }
}


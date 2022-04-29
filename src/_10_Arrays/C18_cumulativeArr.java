package _10_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class C18_cumulativeArr {
    /*

        If the array is { 3, 5, 1, 2, 7, 9, 2, 3, 5, 7 }
        type a program to create a new cumulative array whose elements are like {3, 5+1, 2+7+9, 2+3+5+7}

     */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the element number of cumulative output array : ");
        int degree = scan.nextInt();
        int length = 0;
        for (int i = 1; i <= degree; i++) {
            length += i;
        }
        int[] arr = new int[length];
        for (int i = 0; i < length; i++) {
            System.out.print("Enter the element " + (i + 1) + " of the input array : ");
            arr[i] = scan.nextInt();
        }
        int[] arr2;
        arr2 = createCumulativeArr(arr, degree);
        System.out.print("Cumulative Array : ");
        System.out.println(Arrays.toString(arr2));
    }

    private static int[] createCumulativeArr(int[] arr, int degree) {
        int[] arr2 = new int[degree];
        int length = 0;
        for (int i = 0; i < degree; i++) {
            length += i;
            for (int j = length; j <= length + i; j++) {
                arr2[i] += arr[j];
            }
        }
        return arr2;
    }
}


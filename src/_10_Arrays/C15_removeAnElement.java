package _10_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class C15_removeAnElement {
    /*

    Write a Java program to removes a specific element from an array and put the remaining elements in a new array and prints the new array

    Input :{1,2,3,4,5,6}

    Element:6

    Output : [1,2,3,4,5]

     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] arr = {1, 2, 3, 4, 5, 6};
        System.out.println(Arrays.toString(arr));
        int[] arr2 = new int[5];
        System.out.print("Enter an element to remove:");
        int removedelement = scan.nextInt();
        int counter = 0;
        for (int i = 0; i < arr.length; i++) {
            if (removedelement != arr[i]) {
                arr2[counter] = arr[i];
                counter++;
            }
        }
        System.out.println(Arrays.toString(arr2));
    }
}




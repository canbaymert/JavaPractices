package _10_Arrays;

import java.util.Scanner;

public class C12_dividedByThree {
    // find the numbers that are divided by three without a reminder belongs to an array which is created by user.
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] Arr = new int[8];
        for (int i = 0; i < 8; i++) {
            System.out.print("Enter the unit number " + i + " : ");
            Arr[i] = scan.nextInt();
        }
        int counter = 0;
        System.out.print("Numbers that are divided by three are : ");
        for (int i = 0; i < 8; i++) {
            if (Arr[i] % 3 == 0) {
                counter++;
                System.out.print(Arr[i] + " ");
            }
        }
    }
}


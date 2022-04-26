package _08_ForLoop;

import java.util.Scanner;

public class C15_reverseNumberPyramid {
    /* output:

            1 2 3 4 5 6
             2 3 4 5 6
              3 4 5 6
               4 5 6
                5 6
                 6

     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the height of pyramid : ");
        int num = scan.nextInt();
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= num; j++) {
                if (j >= i) {
                    System.out.print(j + " ");
                } else System.out.print(" ");
            }
            System.out.println("");
        }
    }
}


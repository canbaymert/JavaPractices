package _08_ForLoop;

import java.util.Scanner;

public class C16_sequentTriangle {
    /* output:

    1
    2 3
    4 5 6
    7 8 9 10
    11 12 13 14 15
    16 17 18 19 20 21
    22 23 24 25 26 27 28
    29 30 31 32 33 34 35 36

    */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the size : ");

        int num = scan.nextInt();
        int num2 = 1;
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(num2 + " ");
                num2++;
            }
            System.out.println("");
        }
    }
}


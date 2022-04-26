package _08_ForLoop;

import java.util.Scanner;

public class C22_letterPyramid {
    /* output:
                   A
                  BBB
                 CCCCC
                DDDDDDD
               EEEEEEEEE
    */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the size : ");
        int n=scan.nextInt();
        for (int i = 1, p = 'A'; i < n; i++, p++) {
            for (int j = i; j < n; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print((char) p);
            }
            for (int j = 1; j < i; j++) {
                System.out.print((char) p);
            }
            System.out.println();
        }
    }
}

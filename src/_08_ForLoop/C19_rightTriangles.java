package _08_ForLoop;

import java.util.Scanner;

public class C19_rightTriangles {
    /* output:

     *
     **
     ***
     ****
     *****
     ******
     *******
     ********
     *********

     *********
     ********
     *******
     ******
     *****
     ****
     ***
     **
     *

     * * * * * * * * * * *
     * * * * * * * * *
     * * * * * * * *
     * * * * * * *
     * * * * * *
     * * * * *
     * * * *
     * * *
     * *
     *

     *
     * *
     * * *
     * * * *
     * * * * *
     * * * * * *
     * * * * * * *
     * * * * * * * *
     * * * * * * * * *

     */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the size : ");
        int num = scan.nextInt();
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
        System.out.println("");

        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= num + 1 - i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
        System.out.println("");
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= num + 1 - i; j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
        System.out.println("");
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
        System.out.println("");
    }
}

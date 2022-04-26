package _08_ForLoop;

import java.util.Scanner;

public class C17_pyramid {
    /* output :

         *
        * *
       * * *
      * * * *
     * * * * *

    */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the size : ");
        int num=scan.nextInt();
        for (int i = 1; i<=num; i++) {
            for (int j = 1; j <=num; j++) {
                if (i+j>=num+1){
                    System.out.print("* ");
                }
                else System.out.print(" ");
            }
            System.out.println("");
        }
    }
}

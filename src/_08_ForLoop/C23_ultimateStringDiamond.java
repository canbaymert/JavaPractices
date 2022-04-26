package _08_ForLoop;

import java.util.Scanner;

public class C23_ultimateStringDiamond {
    /* output:

        p
       e e
      r r r
     f f f f
    e e e e e
   c c c c c c
  t t t t t t t
  d d d d d d d
   i i i i i i
    a a a a a
     m m m m
      o o o
       n n
        d

     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the first string:");
        String str = scan.nextLine();
        System.out.print("Enter the second string:");
        String str2 = scan.nextLine();
        str = " " + str;
        for (int i = 0; i < str.length(); i++) {
            for (int j = 0; j <= str.length(); j++) {
                if (i + j >= str.length() + 1) {
                    System.out.print(str.charAt(i) + " ");
                } else System.out.print(" ");
            }
            System.out.println("");
        }
        for (int i = 0; i < str2.length(); i++) {
            for (int j = 0; j <= str2.length(); j++) {
                if (j > i) {
                    System.out.print(" " + str2.charAt(i));
                } else System.out.print(" ");
            }
            System.out.println("");
        }
    }
}




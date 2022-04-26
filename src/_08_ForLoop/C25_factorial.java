package _08_ForLoop;

import java.util.Scanner;

public class C25_factorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num1 = scan.nextInt();
        String str = "1";
        int factorial = 1;
        for (int i = 1; i <= num1; i++) {
            factorial = factorial * i;
            if (i > 1) {
                str = i + "" + "*" + str;
            }
        }
        System.out.println(num1 + "!= " + str + " = " + factorial);
    }
}


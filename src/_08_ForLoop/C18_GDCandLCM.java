package _08_ForLoop;

import java.util.Scanner;

public class C18_GDCandLCM {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter two positive numbers");
        int GDC = 0;
        int LCM = 0;
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        int temp = 0;
        if (num1 <= 0 || num2 <= 0) System.out.println("Wrong input");
        if (num2 > num1) {
            temp = num2;
            num2 = num1;
            num1 = temp;
        }
        for (int i = 1; i <= num2; i++) {
            if (num1 % i == 0 && num2 % i == 0) GDC = i;
        }
        LCM = num1 * num2 / GDC;
        System.out.println("For " + num1 + " and " + num2 + ":\nThe Greatest Common Divisor (GDC) = " + GDC + "\nThe Least Common Multiple (LCM) = " + LCM);
    }
}


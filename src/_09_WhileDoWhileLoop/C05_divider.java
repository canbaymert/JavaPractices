package _09_WhileDoWhileLoop;

import java.util.Scanner;

public class C05_divider {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the dividend number : ");
        int dividend = scan.nextInt();
        System.out.print("Enter the divider number : ");
        int divider = scan.nextInt();
        divideNum(dividend, divider);

    }

    private static void divideNum(int dividend, int divider) {
        int counter = 0;
        if (dividend < divider) System.out.println("Divider cannot be greater than dividend.");
        else {
            while (dividend >= divider) {
                dividend = dividend - divider;
                counter = counter + 1;
            }
            System.out.println("Quotient : " + counter + "\nRemainder : " + dividend);
        }
    }
}
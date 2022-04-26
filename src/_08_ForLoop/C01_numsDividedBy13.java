package _08_ForLoop;

import java.util.Scanner;

public class C01_numsDividedBy13 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the first number : ");
        int beginning = scan.nextInt();
        System.out.print("Enter the last number : ");
        int end = scan.nextInt();
        numsDividedBy13(beginning, end);

    }

    private static void numsDividedBy13(int beginning, int end) {
        int sum = 0;
        int counter = 0;
        for (int i = beginning; i < end; i++) {
            if (i % 13 == 0) {
                counter++;
                System.out.println("Number " + counter + " : " + i);
                sum = sum + i;
            }
        }
        System.out.println("Sum of Numbers : " + sum);
    }
}

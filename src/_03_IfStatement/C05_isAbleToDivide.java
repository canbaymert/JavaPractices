package _03_IfStatement;

import java.util.Scanner;

public class C05_isAbleToDivide {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter a number:");
        double number = scan.nextInt();
        double reminder = number % 10D;
        if (number % 10.0D == 0.0D) {
            System.out.println("Number is able to divide by 10");
        } else if (number % 10.0D != 0.0D) {
            System.out.println("Number is not able to divide by 10 and the reminder is: " + reminder);
        }
    }
}

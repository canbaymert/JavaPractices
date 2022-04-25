package _02_Scanner;

import java.util.Scanner;

public class C02_calculation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("1st number:");
        double num1 = sc.nextDouble();

        System.out.print("2nd number:");
        double num2 = sc.nextDouble();

        System.out.println("Sum: " + (num1 + num2));
        System.out.println("Difference: " + (num1 - num2));
        System.out.println("Multiplication: " + (num1 * num2));
        System.out.println("Division: " + (num1 / num2));
        sc.close();
    }
}


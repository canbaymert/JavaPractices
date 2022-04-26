package _03_IfStatement;

import java.util.Scanner;

public class C01_isTriangle {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        double a, b, c;
        System.out.println("Enter the lengths of Two sides of a triangle");
        a = scan.nextDouble();
        b = scan.nextDouble();
        c = scan.nextDouble();
        if (a < 0 || b < 0 || c < 0) System.out.println("Length of all sides of a triangle should be positive.");
        else {
            if (a + b > c && a - b < c && a + c > b && a - c < b && b + c > a && b - c < a) {
                if (a == b && b == c) {
                    System.out.println("It's an equilateral triangle.");
                } else System.out.println("It's a triangle");
            } else System.out.println("It's not a triangle");
        }
    }
}


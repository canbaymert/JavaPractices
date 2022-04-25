package _03_IfStatement;

import java.util.Scanner;

public class C03_coordinatesOfAPoint {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("X-Coordinate (Domain) of a point");
        double x = scan.nextDouble();
        System.out.print("Y-Coordinate (Range) of a point");
        double y = scan.nextDouble();

        if (x > 0 && y > 0) System.out.println("Point is located on Quadrant 1");
        else if (x < 0 && y > 0) System.out.println("Point is located on Quadrant 2");
        else if (x < 0 && y < 0) System.out.println("Point is located on Quadrant 3");
        else if (x == 0 && y == 0) System.out.println("Point is located on Origin");
        else if (x == 0 && y != 0) System.out.println("Point is located on Y-Axis");
        else if (x != 0 && y == 0) System.out.println("Point is located on X-Axis");
        else System.out.println("Point is located on Quadrant 4.");
    }
}
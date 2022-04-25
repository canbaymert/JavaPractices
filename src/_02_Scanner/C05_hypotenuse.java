package _02_Scanner;

import java.util.Scanner;

public class C05_hypotenuse {
    public static void main(String[] args) {

        // Find the hypotenuse of a triangle

        Scanner scanner = new Scanner(System.in);

        System.out.print("Length of the first leg of right-angled triangle: ");
        int a = scanner.nextInt();

        System.out.print("Length of the second leg of right-angled triangle: ");
        int b = scanner.nextInt();

        double h = Math.sqrt((a * a) + (b * b));
        System.out.println("Length of the Hypotenuse: " + h);

    }
}

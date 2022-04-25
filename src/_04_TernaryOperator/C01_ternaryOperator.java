package _04_TernaryOperator;

import java.util.Scanner;

public class C01_ternaryOperator {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        int number = scan.nextInt();
        String result = (number >= 0) ? ((number < 10) ? ("The number is between 0 and 9.") : ("It is a positive number.")) : ("It is a negative number.");
        System.out.println(result);
    }
}
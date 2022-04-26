package _07_MethodCreation;

import java.util.Scanner;

public class C06_sumOfDigits {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int sayi = scan.nextInt();
        System.out.println("Sum of digits (While Loop Method) : " + addDigits(sayi));
        System.out.println("Sum of digits (%9 Method) : " + addDigits2(sayi));

    }

    public static int addDigits(int number) {
        while (number >= 10) {
            number = sumNumber(number);
        }
        return number;
    }

    private static int sumNumber(int number) {

        int digit = 0;
        int sum = 0;

        while (number > 0) {
            digit = number % 10;
            sum += digit;
            number /= 10;
        }
        return sum;
    }

    public static int addDigits2(int number) {
        number = number % 9;
        return number;
    }
}



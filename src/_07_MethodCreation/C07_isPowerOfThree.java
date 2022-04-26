package _06_Method_Creation;

import java.util.Scanner;

public class C07_isPowerOfThree {



    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        System.out.println(isPowerOfThree(num));

    }

    public static boolean isPowerOfThree(int num) {
        boolean result = false;
        int multiplier = 1;
        for (int i = 1; i < num / 3; i++) {
            multiplier *= 3;
            if (multiplier == num) {
                result = true;
                break;
            }
        }
        return result;
    }
}

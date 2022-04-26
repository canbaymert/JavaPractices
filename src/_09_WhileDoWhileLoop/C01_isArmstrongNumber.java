package _09_WhileDoWhileLoop;

import java.util.Scanner;

public class C01_isArmstrongNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number : ");
        String inputString = scan.next();
        isArmstrong(inputString);
    }

    public static void isArmstrong(String inputString) {
        int sum = 0;
        int num = Integer.parseInt(inputString);
        int counter = 0;
        while (counter < inputString.length()) {
            sum+=Math.pow((Integer.parseInt(inputString.charAt(counter) + "")),inputString.length());
            counter++;
        }

        if (sum == num) System.out.println("Number : " + num + " is an armstrong number.");
        else System.out.println("Number : " + num + " is not an armstrong number.");
    }
}


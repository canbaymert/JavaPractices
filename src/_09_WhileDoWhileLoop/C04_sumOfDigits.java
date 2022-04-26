package _09_WhileDoWhileLoop;

import java.util.Scanner;

public class C04_sumOfDigits {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int input = scan.nextInt();
        String inputString = ""+input;
        sumOfDigits(inputString);
    }

    public static void sumOfDigits(String inputString) {
        int sum= 0;
        int counter=0;
        while (counter<inputString.length()) {
            sum=sum+Integer.parseInt(inputString.charAt(counter)+"");
            counter++;
        }
        System.out.println("Sum of digits of the number : "+sum);
    }
}


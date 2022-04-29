package _17_exceptions;

import java.util.Random;

public class C02_randomNums {

    /*

    Create a method called randomNum which generates two random number between 0 and 10
    Sum these numbers
    If sum of these numbers is not greater than 12, throw an expection with a message

     */

    public static void main(String[] args) {
        randomNum();
    }

    private static void randomNum() {
        Random rnd = new Random();
        int sum = 0;
        while (true) {
            int num1 = rnd.nextInt(10);
            int num2 = rnd.nextInt(10);
            try {
                sum = num1 + num2;
                if (sum < 12)
                    throw new Exception();
                else {
                    System.out.println("Number 1 : " + num1 + "\nNumber 2 : " + num2);
                    System.out.println("Sum : " + sum);
                    break;
                }
            } catch (Exception e) {
                System.out.println("Number 1 : " + num1 + "\nNumber 2 : " + num2);
                System.out.println("Sum must be greater than 12 ");
            }
        }
    }
}

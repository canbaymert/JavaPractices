package _03_IfStatement;

import java.util.Scanner;

public class C07_numberComparsion {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter Two numbers");
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        int num3 = scan.nextInt();

        if (num1 >= num2 && num1 >= num3) {
            System.out.println(num1 + " is the biggest number");
            if (num2 >= num3) {
                System.out.println(num3 + " is the smallest number");
            } else {
                System.out.println(num2 + " is the smallest number");
            }
        } else if (num2 >= num1 && num2 >= num3) {
            System.out.println(num2 + " is the biggest number");
            if (num1 >= num3) {
                System.out.println(num3 + " is the smallest number");
            } else {
                System.out.println(num1 + " is the smallest number");
            }
        }else {
            System.out.println(num3 + " is the biggest number");
            if (num1 >= num2) {
                System.out.println(num2 + " is the smallest number");
            } else {
                System.out.println(num1 + " is the smallest number");
            }
        }
    }
}


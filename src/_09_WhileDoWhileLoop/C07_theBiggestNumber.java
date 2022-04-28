package _09_WhileDoWhileLoop;

import java.util.Scanner;

public class C07_theBiggestNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int thebiggestnum = 0;
        int counter = 0;
        do {
            System.out.print("Enter a number : ");
            int num = scan.nextInt();
            if (num >= thebiggestnum) thebiggestnum = num;
            counter++;
        }
        while (counter < 5);
        System.out.println("The biggest number is : " + thebiggestnum);
    }
}


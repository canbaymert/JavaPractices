package _09_WhileDoWhileLoop;

import java.util.Scanner;

public class C02_powOfNum {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.print("Enter a number");
        int num=scan.nextInt();
        System.out.print("Enter power of number : ");
        int pow=scan.nextInt();
        int counter=1;
        int result=1;
        while (counter <= pow) {
            result = result * num;
            counter++;
        }
        System.out.println((counter-1)+" power of "+num+" = "+result);
    }
}

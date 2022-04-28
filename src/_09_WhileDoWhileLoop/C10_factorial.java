package _09_WhileDoWhileLoop;

import java.util.Scanner;

public class C10_factorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a positive number : ");
        int num = scan.nextInt();
        if (num < 0) System.out.println("Input is not a positive number.");
        else if (num == 0) System.out.println("1*1=1");
        else {
            String str = "";
            int result = 1;
            while (num >= 1) {
                result *= num;
                if (num == 1) str += num + "";
                else str += num + "*";
                num--;
            }
            System.out.println(str + "=" + result);
        }
    }
}

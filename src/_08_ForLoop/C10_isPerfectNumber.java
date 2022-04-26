package _08_ForLoop;

import java.util.Scanner;

public class C10_isPerfectNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = scan.nextInt();
        int sum = 0;
        for (int i = 1; i < num; i++) {
            if (num % i == 0) sum += i;
        }
        if (num == sum) System.out.println(num + " is a perfect number.");
        else System.out.println(num + " is not a perfect number.");
    }
}

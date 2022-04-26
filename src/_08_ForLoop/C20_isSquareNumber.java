package _08_ForLoop;

import java.util.Scanner;

public class C20_isSquareNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = scan.nextInt();
        int counter = 1;
        boolean control = false;
        while (counter * counter <= num) {
            if (counter * counter == num) control = true;
            counter++;
        }
        if (control) System.out.println("It is a square number.");
        else System.out.println("It's not a square number.");
    }
}


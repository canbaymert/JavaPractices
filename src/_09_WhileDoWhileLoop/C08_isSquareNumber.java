package _09_WhileDoWhileLoop;

import java.util.Scanner;

public class C08_isSquareNumber {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a num:");
        int num = scan.nextInt();
        int counter = 1;
        boolean control = false;
        while (counter * counter <= num) {
            if (counter * counter == num) {
                control = true;
                break;
            }
            counter++;
        }
        System.out.println(control);
    }
}


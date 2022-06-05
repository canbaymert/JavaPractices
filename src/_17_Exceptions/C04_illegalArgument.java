package _17_Exceptions;

import java.util.Scanner;

public class C04_illegalArgument {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your age : ");
        int age = scan.nextInt();
        if (age <= 0 || age > 120) {
            throw new IllegalArgumentException();
        } else {
            System.out.println("Age information is accepted.");
        }
    }
}


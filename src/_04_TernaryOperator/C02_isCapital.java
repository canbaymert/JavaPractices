package _04_TernaryOperator;

import java.util.Scanner;

public class C02_isCapital {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a letter: ");
        String character = scan.nextLine();
        char x = character.charAt(0);
        String result = x >= 'a' && x <= 'z' || x >= 'A' && x <= 'Z' ? x >= 'a' ? "Lower Letter" : "Uppercase Letter" : "Not a letter";
        System.out.println(result);
    }
}

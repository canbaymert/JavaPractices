package _06_StringManipulation;

import java.util.Scanner;

public class C05_halfOfWord {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a string with an even number of letters: ");
        String str = scan.nextLine();
        if (str.contains(" ") || str.length() % 2 != 0) System.out.println("Wrong input");
        else {
            int half = str.length() / 2;
            System.out.println(str.substring(0, half));
        }
    }
}
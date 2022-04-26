package _06_StringManipulation;

import java.util.Scanner;

public class C03_reverseString {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a word with four letters : ");
        String word = scan.nextLine();
        String letter1 = word.substring(0, 1);
        String letter2 = word.substring(1, 2);
        String letter3 = word.substring(2, 3);
        String letter4 = word.substring(3);

        String reverse = (letter4 + letter3 + letter2 + letter1);
        System.out.println("Reverse of the given string : " + reverse);
    }
}

package _08_ForLoop;

import java.util.Locale;
import java.util.Scanner;

public class C09_isVowel {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a letter : ");
        String letter = scan.nextLine().toLowerCase(Locale.ROOT);
        if (letter.length() > 1) System.out.println("Input includes more than one character.");
        else if (letter.charAt(0) <= 'z' && letter.charAt(0) >= 'a') {
            if (letter.charAt(0) == 'a' || letter.charAt(0) == 'e' || letter.charAt(0) == 'i' ||
                    letter.charAt(0) == 'o' || letter.charAt(0) == 'u') {
                System.out.println(letter.charAt(0) + " is a vowel.");
            } else if (letter.charAt(0) == 'w' || letter.charAt(0) == 'y') {
                System.out.println(letter.charAt(0) + " is sometimes a vowel.");
            } else System.out.println(letter.charAt(0) + " is not a vowel.");
        } else System.out.println("Input is not a letter.");
    }
}


package _08_ForLoop;

import java.util.Locale;
import java.util.Scanner;

public class C11_letterCounter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a sentence : ");
        String sentence = scan.nextLine().toLowerCase(Locale.ROOT);
        System.out.print("Enter a letter : ");
        String letter = scan.nextLine().toLowerCase(Locale.ROOT);
        int numberofchar = 0;
        if (letter.length() > 1) System.out.println("A letter cannot contain more than one character.");
        else if (letter.charAt(0) < 'a' || letter.charAt(0) > 'z') System.out.println("It is not a letter");
        else {
            for (int i = 999999999; i > 0; i--) {
                if (sentence.contains(letter.charAt(0) + "")) {
                    sentence = sentence.replaceFirst(letter.charAt(0) + "", "");
                    numberofchar++;
                } else i = 0;
            }
            System.out.println("In this sentence the letter '" + letter + "' is used " + numberofchar + " times.");
        }
    }
}

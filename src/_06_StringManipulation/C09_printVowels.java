package _06_StringManipulation;

import java.util.Scanner;

public class C09_printVowels {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string : ");
        String str = scanner.nextLine().toLowerCase();
        String s = str.replaceAll("[^aeiou]", "");
        System.out.println(s);
    }
}


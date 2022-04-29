package _10_Arrays;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class C17_isAnagram {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the first word:");
        String str1 = scan.next().toLowerCase(Locale.ROOT);
        System.out.print("Enter the second word:");
        String str2 = scan.next().toLowerCase(Locale.ROOT);
        isAnagram(str1, str2);
    }

    public static void isAnagram(String str1, String str2) {

        if (str1.length() != str2.length()) System.out.println("The words are not anagram of each other");
        else {
            String[] arr1 = new String[str1.length()];
            String[] arr2 = new String[str2.length()];
            for (int i = 0; i < str1.length(); i++) {
                arr1[i] = str1.substring(i, i + 1);
            }
            Arrays.sort(arr1);
            for (int i = 0; i < str2.length(); i++) {
                arr2[i] = str2.substring(i, i + 1);
            }
            Arrays.sort(arr2);
            if (Arrays.toString(arr1).equals(Arrays.toString(arr2)))
                System.out.println("The words are anagram of each other.");
            else System.out.println("The words are not anagram of each other.");
        }
    }
}



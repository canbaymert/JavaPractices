package _08_ForLoop;

import java.util.Scanner;

public class C07_isPalindrome {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a string:");
        String str = scan.nextLine();
        String reversestr = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reversestr += str.charAt(i);
        }
        System.out.println("Reverse of the string : " + reversestr);
        if (str.equalsIgnoreCase(reversestr)) {
            System.out.println("It's a palindrome.");
        } else {
            System.out.println("It's not a palindrome.");
        }
    }
}

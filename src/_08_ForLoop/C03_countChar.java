package _08_ForLoop;

import java.util.Scanner;

public class C03_countChar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a string : ");
        String str = scan.nextLine();
        System.out.print("Enter a character : ");
        char charx = scan.next().charAt(0);
        int counter = 0;
        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) == charx) counter++;
        }
        System.out.println("Number of char '"+charx+ "' in the given string ("+str+") is : " + counter);
    }
}
package _08_ForLoop;

import java.util.Scanner;

public class C21_continue {

    // Write each character of a string to another line of screen and skip the space character.

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a string : ");
        String str = scan.nextLine();

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ')
                continue;
            System.out.println(str.charAt(i));
        }
    }
}

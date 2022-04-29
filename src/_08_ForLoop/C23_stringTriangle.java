package _08_ForLoop;

import java.util.Scanner;

public class C23_stringTriangle {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a string : ");
        String str = scan.next();
        for (int i = 0; i < str.length(); i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(str.charAt(i) + " ");
            }
            System.out.println();
        }

    }
}


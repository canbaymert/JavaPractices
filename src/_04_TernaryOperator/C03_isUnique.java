package _04_TernaryOperator;

import java.util.Scanner;

public class C03_isUnique {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a word with three letters:");
        String name = scan.nextLine();
        if (name.length() != 3) System.out.println("The word doesn't consist of three letters");
        else {
            char x = name.charAt(0);
            char y = name.charAt(1);
            char z = name.charAt(2);
            String result = (x == y) ? (x == z) ? ("All letters of the word are the same.")
                    : ("Two letters of the word are the same.") : (x == z) ? ("Two letters of the word are the same.")
                    : (y == z) ? ("Two letters of the word are the same.") : ("All letters of the word are different.");
            System.out.println(result);
        }
    }
}


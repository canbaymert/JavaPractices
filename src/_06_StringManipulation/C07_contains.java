package _06_StringManipulation;

import java.util.Scanner;

public class C07_contains {
    public static void main(String[] args) {

        System.out.print("Enter a word : ");
        Scanner scan = new Scanner(System.in);
        String word = scan.nextLine();
        if (word.contains("a") && !word.contains("Z")) System.out.println("Given word includes the a letter");
        else if (word.contains("Z") && !word.contains("a")) System.out.println("Given word includes the z letter");
        else if (word.contains("Z") && word.contains("a")) System.out.println("Given word includes the a and z letters");
        else System.out.println("Given word doesn't include the a or z letters");
    }
}
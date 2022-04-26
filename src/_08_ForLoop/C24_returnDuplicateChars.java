package _08_ForLoop;

import java.util.Arrays;
import java.util.Scanner;

public class C24_returnDuplicateChars {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a string : ");
        String str = scan.nextLine();
        String str2 = "";
        String output = "";
        for (int i = 0; i < str.length(); i++) {
            str2 = str.substring(i, i + 1);
            if (str.substring(i + 1).contains(str2)) {
                if (!output.contains(str2)) output += str2 + " ";
            }
        }
        System.out.print("Duplicated characters are : ");
        String[] outputarr = output.split(" ");
        System.out.println(Arrays.toString(outputarr));
    }
}


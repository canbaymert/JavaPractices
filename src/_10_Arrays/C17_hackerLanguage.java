package _10_Arrays;

import java.util.Scanner;

public class C17_hackerLanguage {

    /*

    Convert a string to hacker language:
    s -> 5
    a -> 4
    e -> 3
    i -> 1
    o -> 0

    */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a string :");
        String str = scan.nextLine().toLowerCase();
        hackerLanguage(str);
    }

    private static void hackerLanguage(String str) {
        String[] arr = new String[str.length()];

        for (int i = 0; i < str.length(); i++) {
            arr[i] = str.substring(i, i + 1);
        }

        for (int i = 0; i < str.length(); i++) {
            if (arr[i].contains("s")) {
                arr[i] = "5";
            }
            if (arr[i].contains("a")) {
                arr[i] = "4";
            }
            if (arr[i].contains("e")) {
                arr[i] = "3";
            }
            if (arr[i].contains("i")) {
                arr[i] = "1";
            }
            if (arr[i].contains("o")) {
                arr[i] = "0";
            }
            System.out.print("Converted string : " + arr[i]);
        }
    }
}

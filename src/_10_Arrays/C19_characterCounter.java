package _10_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class C19_characterCounter {
    //Find and print usage times of characters in a string as an array.
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a string : ");
        String str = scan.nextLine();
        String[] arr = str.split("");
        String[] arr2 = new String[arr.length];

        for (int i = 0; i < arr.length; i++) {
            int counter = 0;
            for (int j = 0; j < arr.length; j++) {
                if (i != j) {
                    if (arr[i].equals(arr[j])) counter++;
                }
                arr2[i] = arr[i] + "=" + (counter + 1);
            }
        }

        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (i != j) {
                    if (arr2[i].equals(arr2[j])) arr2[j] = "";
                }
            }
        }
        Arrays.sort(arr2);
        String str2 = ignoreRepetition(str);
        String[] arr3 = new String[str2.length()];

        for (int j = 0; j < arr3.length; j++) {
            for (int i = 0; i < arr2.length; i++) {

                if (arr2[i] != "") {
                    arr3[j] = arr2[i];
                    j++;
                }
            }
        }
        System.out.println(Arrays.toString(arr3));
    }

    public static String ignoreRepetition(String str) {
        String newstr = "";
        for (int i = 0; i < str.length(); i++) {
            if (i == 0) {
                newstr = str.substring(i, i + 1);
            } else {
                if (!newstr.contains(str.substring(i, i + 1))) {
                    newstr = newstr + str.substring(i, i + 1);
                }
            }
        }
        return newstr;
    }
}

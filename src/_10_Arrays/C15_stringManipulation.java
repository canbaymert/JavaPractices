package _10_Arrays;

import java.util.Arrays;

public class C15_stringManipulation {
    //input : Congratulations output: sniitilitirgniC
    public static void main(String[] args) {
        String str = "Congratulations";
        System.out.println("input = " + str);
        String arr1[] = str.split("");
        String arr2[] = new String[arr1.length];
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i].contains("o") || arr1[i].contains("u") || arr1[i].contains("a")) {
                arr1[i] = arr1[i].replaceAll("a", "i");
                arr1[i] = arr1[i].replaceAll("o", "i");
                arr1[i] = arr1[i].replaceAll("u", "i");
            }
            arr2[arr2.length - 1 - i] = arr1[i];
        }
        System.out.println(Arrays.toString(arr2));
        String strnew = "";
        for (int i = 0; i < arr2.length; i++) {
            strnew += arr2[i];
        }
        System.out.println("output = " + strnew);
    }
}

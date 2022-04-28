package _10_Arrays;

import java.util.Arrays;

public class C10_changeArray {
        /*
        you have a string "VerySuccessful"
        with arrays change it to "NotSuccessful" and print the result.
        */
    public static void main(String[] args) {
        String str1="VerySuccessful";
        String[] str2 =str1.split("y");
        str2[0]="Not";
        str1=str2[0]+str2[1];
        System.out.println(str1);
    }
}



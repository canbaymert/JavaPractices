package _10_Arrays;

public class C14_isDigit {
    /*
    Write a method which accepts string as parameter and prints the sum of digits
    present in the given string
    input :"ate1r5d3"
    output : 9
     */
    public static void main(String[] args) {
        String str = "ate1r5d3";
        sumofnums(str);
    }

    private static void sumofnums(String str) {
        str = str.replaceAll("\\D", "");
        String str2[] = str.split("");
        int sum = 0;
        for (int i = 0; i < str2.length; i++) {
            sum = sum + Integer.parseInt(str2[i]);
        }
        System.out.println("the sum of digits in the given string : " + sum);
    }
}


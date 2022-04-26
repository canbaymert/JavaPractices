package _07_MethodCreation;

public class C04_reverseString {
    public static void main(String[] args) {
        String str = "I Love Java!";
        String reversestr = reverseString(str);
        System.out.println(reversestr);
    }

    public static String reverseString(String str) {
        String reverseString = "";
        for (int i = str.length() - 1; i > -1; i--) {
            reverseString = reverseString + str.substring(i, i + 1);
        }
        return reverseString;
    }
}



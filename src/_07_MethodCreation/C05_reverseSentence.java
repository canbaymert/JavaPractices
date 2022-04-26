package _07_MethodCreation;

public class C05_reverseSentence {
    public static void main(String[] args) {
        String str = "Weather is not very good";

        String reversedsentence = reverseSentence(str);
        System.out.println(reversedsentence);
    }

    private static String reverseSentence(String str) {
        String reversedsentence = "";
        int i;
        for (i = str.length() - 1; i >= 0; i--) {
            if (str.substring(i, (i + 1)).equals(" ")) {
                reversedsentence = reversedsentence + str.substring(i);
                str = str.substring(0, i);
            }
            if (i == 0) {
                reversedsentence = reversedsentence + " " + str.substring(i);
            }
        }
        return reversedsentence;
    }
}


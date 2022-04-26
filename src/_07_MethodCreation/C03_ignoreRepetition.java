package _07_MethodCreation;

public class C03_ignoreRepetition {
    public static void main(String[] args) {
        String str = "aabbcccccdzzzdddaaa";
        ignoreRepetition(str);
    }

    public static void ignoreRepetition(String str) {
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
        System.out.println(newstr);
    }
}

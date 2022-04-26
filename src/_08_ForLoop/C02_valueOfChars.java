package _08_ForLoop;

public class C02_valueOfChars {
    public static void main(String[] args) {
        int counter = 0;
        for (char i = 0; i < 256; i++) {
            System.out.println(i + " : " + counter);
            counter++;
        }
    }
}

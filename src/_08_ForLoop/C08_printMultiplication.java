package _08_ForLoop;


public class C08_printMultiplication {
    public static void main(String[] args) {
        //output:
        // 1 x 1 = 1
        // 1 x 2 = 2
        // 1 x 3 = 3
        // 1 x 4 = 4
        // 1 x 5 = 5
        // 1 x 6 = 6
        // 1 x 7 = 7
        // 1 x 8 = 8
        // 1 x 9 = 9
        // 1 x 10 = 10

        for (int i = 1; i < 11; i++) {
            System.out.println("1 x " + i + " = " + i);
        }
    }
}

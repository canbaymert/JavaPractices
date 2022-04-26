package _08_ForLoop;

public class C14_letterTriangle_2 {
    /* output:

       A
       B B
       C C C
       D D D D
       E E E E E
       F F F F F F

    */
    public static void main(String[] args) {
        char input = 'F';
        for (char i = 'A'; i <= input; i++) {
            for (char j = 'A'; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println("");
        }
    }
}


package _08_ForLoop;

public class C13_letterTriangle {
        /* output:

        A
        A B
        A B C
        A B C D
        A B C D E
        A B C D E F

        */
        public static void main(String[] args) {
        char input ='F';
        for (char i = 'A'; i <=input ; i++) {
            for (char j = 'A'; j <=i ; j++) {
                System.out.print(j + " ");
            }
            System.out.println("");
        }
    }
}


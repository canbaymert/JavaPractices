package _08_ForLoop;

public class C04_rectangle {
    /* Output:

                   #####
                   #####
                   #####
                   #####

    */
    public static void main(String[] args) {
        for (int i = 0; i < 4; i++) {
            System.out.print("#");
            for (int j = 0; j < 5; j++) {
                System.out.print("#");
            }
            System.out.println("");
        }
    }
}





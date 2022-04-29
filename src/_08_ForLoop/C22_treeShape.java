package _08_ForLoop;

import java.util.Scanner;

public class C22_treeShape {

    /* output:
                ^
                ^^
                ^^^
                ^^^^
                ^^^^^
                ^^^^^^
                |||
                |||
                |||
                |||
                |||

    */

    public static void main(String[] args) {

        String top = "";
        for (int i = 0; i < 6 ; i++) {
            top += "^";
            System.out.println(top);
        }

        for (int i = 0; i < 5; i++)
            System.out.println("|||");
    }
}


package _08_ForLoop;

import java.util.Scanner;

public class C06_unitMatrix {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the size of the unit matrix : ");
        int num = scan.nextInt();
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
                if (i == j) System.out.print(1);
                else System.out.print(0);
            }
            System.out.println("");
        }
    }
}


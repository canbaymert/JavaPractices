package _09_WhileDoWhileLoop;

import java.util.Scanner;

public class C12_freeFallingBall {
    public static void main(String[] args) {
        //When a ball bounces, it rises up to `%75' of the height from which it fell.
        //The ball doesn't bounce when the falling distance is 1 meter or below.

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the height as meters : ");
        float totaldistance = 0;
        int counter = 0;
        float height = scan.nextFloat();
        float firstheight = height;

        do {
            totaldistance += height;
            height = height * 3 / 4;
            counter++;
        }
        while (height >= 1);
        totaldistance += height;
        totaldistance = totaldistance * 2 - firstheight;
        System.out.println("The ball bounces " + counter + " times and covers total " + totaldistance + " meter distance.");
    }
}


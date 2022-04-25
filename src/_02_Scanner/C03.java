package _02_Scanner;

import java.util.Scanner;

public class C03 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Please enter a number with at least five decimal places: ");

        int num = sc.nextInt(); //12345

        int firsttwo = num / 1000; //12

        int lasttwo = num % 100; //45

        int sumoffirsttwo = (firsttwo % 10) + (firsttwo / 10);

        int sumoflasttwo = (lasttwo % 10) + (lasttwo / 10);

        System.out.println("Sum: " + (sumoffirsttwo + sumoflasttwo)); //
        sc.close();
    }
}

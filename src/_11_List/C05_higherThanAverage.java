package _11_List;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C05_higherThanAverage {
    public static void main(String[] args) {
        // Get numbers from the user. Find the average of them and print the numbers that are higher than average.
        List<Integer> notlar = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        int number = 0;
        double sum = 0;
        do {
            System.out.print("Enter positive numbers  (Enter -1 to finish) : ");
            number = scan.nextInt();
            if (number < -1) System.out.println("Wrong input");
            else if (number == -1) break;
            else {
                notlar.add(number);
                sum += number;
            }
        }
        while (number != -1);

        double average = sum / notlar.size();
        int counter = 0;
        System.out.println("Numbers that are higher than the average : ");
        for (int i = 0; i < notlar.size(); i++) {
            if (notlar.get(i) > average) {
                System.out.println(notlar.get(i));
            }
        }
    }
}


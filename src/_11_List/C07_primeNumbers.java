package _11_List;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C07_primeNumbers {
    // Print the prime numbers between 0 and the desired number

    public static void main(String[] args) {
        List<Integer> primeNumbers = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = scan.nextInt();
        int counter = 0;
        for (int i = 2; i < num; i++) {
            for (int j = 2; j < 100; j++) {
                if (i % j == 0) {
                    counter++;
                }
            }
            if (counter == 1) primeNumbers.add(i);
            counter = 0;
        }
        System.out.println(primeNumbers);
    }
}

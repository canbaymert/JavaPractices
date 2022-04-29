package _11_List;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*

Create fibonacci series until the desired number.
0-1-1-2-3-5-8-13-21-34....

*/

public class C11_fibonacci {
    public static void main(String[] args) {
        List<Integer> fibonacci = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = scan.nextInt();
        fibonacci.add(0);
        fibonacci.add(1);

        int i = 1;
        if (num <= 1) {
            System.out.println("Enter a bigger number. ");
        } else {
            while (fibonacci.get(i) < num) {
                fibonacci.add(fibonacci.get(i) + fibonacci.get(i - 1));
                i++;
            }
            if (fibonacci.get(fibonacci.size() - 1) > num) {
                fibonacci.remove(fibonacci.size() - 1);
                System.out.println("Fibonacci series don't include the number : " + num +
                        "\nThe fibonacci series until that number : " + fibonacci);
            } else
                System.out.println("Fibonacci series includes the number :" + num +
                        "\nThe fibonacci series until that number : " + fibonacci);

        }
    }
}

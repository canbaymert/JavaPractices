package _18_linkedList;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

public class C02_removeName {
    public static void main(String[] args) {

        LinkedList<String> ll1 = new LinkedList<>(Arrays.asList("TOYOTA", "WOLKSWAGEN", "AUDI", "MERCEDES"));

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a car brand : ");

        String brand = scan.nextLine().toUpperCase();
        if (ll1.contains(brand)) {
            ll1.remove(brand);
            System.out.println("The brand was in the linkedlist and removed.");
            System.out.println("New list : " + ll1);
        } else System.out.println("The brand isn't in the linkedlist");
        System.out.println("The list : " + ll1);
    }
}


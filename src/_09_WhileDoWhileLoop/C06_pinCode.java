package _09_WhileDoWhileLoop;

import java.util.Scanner;

public class C06_pinCode {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String pin ="4321";
        String entry="";
        int counter=3;
        do {
            System.out.print("Enter pin code : ");
            entry = scan.nextLine();
            if (!entry.equals(pin)) {
                System.out.println("Wrong pin code");
                counter--;
            } else {
                System.out.println("Access granted");
                break;
            }
        }
        while (counter>0);
            if (counter==0) System.out.println("Too many invalid entrance. Access denied. ");
    }
}


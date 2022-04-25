package _03_IfStatement;

import java.util.Scanner;

public class C04_totalPrice {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the number of a product");
        int quantity = scan.nextInt();
        System.out.println("Please enter the price of a product");
        double price = scan.nextDouble();
        System.out.println("Do you have a membership card? (Y or N)");
        char card = scan.next().toLowerCase().charAt(0);
        double totalPrice;
        if (card == 'y') {
            if (quantity > 10) {
                price *= 0.8D;
                totalPrice = price * (double)quantity;
                System.out.println("You got %20 discount ! Final Price: " + totalPrice);
            } else {
                price *= 0.85D;
                totalPrice = price * (double)quantity;
                System.out.println("You got %15 discount ! Final Price: " + totalPrice);
            }
        } else if (card == 'n') {
            if (quantity > 10) {
                price *= 0.85D;
                totalPrice = price * (double)quantity;
                System.out.println("You got %15 discount ! Final Price: " + totalPrice);
            } else {
                price -= price * 10.0D / 100.0D;
                totalPrice = price * (double)quantity;
                System.out.println("You got %10 discount ! Final Price: " + totalPrice);
            }
        } else {
            System.out.println("Wrong Input");
        }
    }
}


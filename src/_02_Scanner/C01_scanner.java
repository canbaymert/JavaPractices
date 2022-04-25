package _02_Scanner;

import java.util.Scanner;

public class C01_scanner {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String name, surname;
        int age, weight;
        double height;
        System.out.print("Name: ");
        name = scan.nextLine();

        System.out.print("Surname: ");
        surname = scan.nextLine();

        System.out.print("Age: ");
        age = scan.nextInt();

        System.out.print("Height: ");
        height = scan.nextDouble();

        System.out.print("Weight: ");
        weight = scan.nextInt();

        System.out.println("Name : " + name + "\n" + "Surname : " + surname + "\n" + "Age : " + age +
                "\n" + "Height : " + height + "\n" + "Weight : " + weight);
        scan.close();
    }
}


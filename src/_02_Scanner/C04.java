package _02_Scanner;

import java.util.Scanner;

public class C04 {

    public static void main(String[] args) {
        //Body Mass Index Calculator

        Scanner scan = new Scanner(System.in);
        System.out.print("Weight(kg): ");

        double weight = scan.nextDouble();
        System.out.print("Height(cm): ");

        double height = scan.nextDouble();
        height = height / 100;  // height/=100

        double bmi = weight / (height * height);

        System.out.println("Body Mass Index(BMI)= " + bmi);
        scan.close();


    }

}



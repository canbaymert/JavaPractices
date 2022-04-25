package _03_IfStatement;

import java.util.Scanner;

public class C02_BMI {
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

        if (bmi<=20){
            System.out.println("Thin");
        }
        else if (bmi<=25) {
            System.out.println("Normal");
        }
        else if (bmi<=30) {
            System.out.println("Overweight");
        }
        else System.out.println("Obese");
    }
}



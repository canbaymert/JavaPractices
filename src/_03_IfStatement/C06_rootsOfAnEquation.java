package _03_IfStatement;

import java.util.Scanner;

public class C06_rootsOfAnEquation {
    public static void main(String[] args) {
        // Equation should be like ax^2 + bx + c
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a,b,c values of an equation with order");
        double a= scan.nextDouble();
        double b= scan.nextDouble();
        double c= scan.nextDouble();
        double Delta=b*b-4*a*c;
        if(Delta>0) System.out.println("There are two roots"+"\n1st Root:"+(-b+Math.sqrt(Delta))/(2*a)+"\n2nd Root:"+(-b-Math.sqrt(Delta))/(2*a));
        if(Delta==0) System.out.println("There is one root"+"\nRoot:"+(-b/2*a));
        if(Delta<0) System.out.println("There aren't any roots");
    }
}


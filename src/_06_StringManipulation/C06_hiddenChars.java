package _06_StringManipulation;

import java.util.Scanner;

public class C06_hiddenChars {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.print("Name : ");
        String name=scan.nextLine();
        System.out.print("Surname:");
        String surname=scan.nextLine();
        System.out.print("Credit Card Number");
        String ccno=scan.nextLine();

        if (ccno.length() != 16) System.out.println("Wrong Credit Card Number");

        else {
            String ccno2=ccno.substring(0,12).replaceAll("\\S","*");
            String ccno3=ccno.substring(12);
            String ccx=ccno2+ccno3;
            String name2=name.substring(1).replaceAll("\\S","*");
            String name3=name.substring(0,1);
            String namex=name3+name2;
            String surname2=surname.substring(1).replaceAll("\\S","*");
            String surname3=surname.substring(0,1);
            String surnamex=surname3+surname2;
            System.out.println("name :"+namex+" surname :"+surnamex+" Card Number :"+ccx);
        }
    }
}


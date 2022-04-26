package _09_WhileDoWhileLoop;

import java.util.Scanner;

public class C03_printOddIndex {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number : ");
        String input=scan.nextLine();
        int counter=0;
        String output="";
        while(counter<input.length()) {
            if(input.charAt(counter)<='9' && input.charAt(counter)>='1') {
                if (Integer.parseInt(input.charAt(counter) + "") % 2 == 1) {
                    output = output + (input.charAt(counter) + "");
                }
            }
            counter++;
        }
        System.out.println("Digits with odd index : "+output);
    }
}
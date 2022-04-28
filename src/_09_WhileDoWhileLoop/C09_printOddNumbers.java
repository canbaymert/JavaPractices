package _09_WhileDoWhileLoop;

import java.util.Scanner;

public class C09_printOddNumbers {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.print("Enter a positive number : ");
        int num=scan.nextInt();
        String result="";
        if(num<=0) System.out.println("Wrong input");
        else {
            while(num>0) {
                if (num%2==1) {
                    result=result+(num+" ");
                    num--;
                }
                else num--;

            }
            System.out.println("The odd numbers until the given number : "+result);
        }
    }
}


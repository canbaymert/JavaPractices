package _11_List;

import java.util.Scanner;

public class C10_printMaxCountChar {
    /*  Write a Java program to get a String from user as input and find the maximumCounts occurring character in that string.
         (Ignore case sensitivity)
          input : Learning java is easy
          output: Max occurring character is : a (4 times)
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String arr[] = scan.nextLine().split("");
        String maxoccuring = "";
        int maxCounter = 0;
        int counter = 1;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i].equalsIgnoreCase(arr[j])) {
                    counter++;
                }
            }
            if (counter > maxCounter) {
                maxCounter = counter;
                maxoccuring = arr[i];
            } else if (counter == maxCounter) {
                maxoccuring += ", " + arr[i];
            }
            counter = 1;
        }
        System.out.println("Max occurring character(s) : " + maxoccuring + " (" + maxCounter + " times)");
    }
}


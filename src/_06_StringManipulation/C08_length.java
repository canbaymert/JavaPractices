package _06_StringManipulation;

import java.util.Scanner;

public class C08_length {
    public static void main(String[] args) {
        System.out.print("Enter your name and surname with a blank between them : ");
        Scanner scan = new Scanner(System.in);
        String namesurname = scan.nextLine();
        int space = namesurname.indexOf(" ");
        String name = namesurname.substring(0, space);
        String surname = namesurname.substring(space + 1);

        if (name.length() > surname.length()) System.out.println("Name is longer than surname");
        else if (name.length() < surname.length()) System.out.println("Surname is longer than name");
        else System.out.println("Lengths of the name and the surname are the same");
    }
}

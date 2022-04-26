package _06_StringManipulation;

import java.util.Scanner;

public class C01_nameSurname {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter your name and surname with a blank between them : ");
        String namesurname = scan.nextLine();
        int indexofspace = namesurname.indexOf(" ");
        String name = namesurname.substring(0, indexofspace);
        String surname = namesurname.substring(indexofspace + 1);
        System.out.println("Name : " + name);
        System.out.println("Surname : " + surname);
    }
}

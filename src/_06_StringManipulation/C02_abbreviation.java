package _06_StringManipulation;

import java.util.Scanner;

public class C02_abbreviation {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a name with three words : ");
        String namesurname = scan.nextLine();
        int indexofspace1 = namesurname.indexOf(" ");
        int indexofspace2 = namesurname.lastIndexOf(" ");
        char letter1 = namesurname.substring(0, indexofspace1).toUpperCase().charAt(0);
        char letter2 = namesurname.substring(indexofspace1 + 1).toUpperCase().charAt(0);
        char letter3 = namesurname.substring(indexofspace2 + 1).toUpperCase().charAt(0);

        System.out.println(namesurname + " -> " + letter1 + "." + letter2 + "." + letter3 + ".");
    }
}

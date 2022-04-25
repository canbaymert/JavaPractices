package _05_SwitchCase;

import java.util.Scanner;

public class C02_printNumberWithLetters {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter an number with maximum Two digit places:");
        int number = scan.nextInt();
        if (number >= 1000 || number <= -1000)
            System.out.println("The number has greater digit places than Two");
        else {
            if (number == 0) System.out.println("Zero");
            else if (number < 0) {
                number = number * (-1);
                System.out.print("Minus ");
            }
            int unitsdigit = number % 10;
            int tensdigit = (number / 10) % 10;
            int hundredsdigit = (number / 100) % 10;

            switch (hundredsdigit) {
                default:
                    break;
                case 1:
                    System.out.print("A hundred ");
                    break;
                case 2:
                    System.out.print("Two Hundred ");
                    break;
                case 3:
                    System.out.print("Three Hundred ");
                    break;
                case 4:
                    System.out.print("Four Hundred ");
                    break;
                case 5:
                    System.out.print("Five Hundred ");
                    break;
                case 6:
                    System.out.print("Six Hundred ");
                    break;
                case 7:
                    System.out.print("Seven Hundred ");
                    break;
                case 8:
                    System.out.print("Eight Hundred ");
                    break;
                case 9:
                    System.out.print("Nine Hundred ");
                    break;
            }
            switch (tensdigit) {
                default:
                    break;
                case 1:
                    if (unitsdigit == 0) System.out.print("Ten ");
                    if (unitsdigit == 1) System.out.print("Eleven ");
                    if (unitsdigit == 2) System.out.print("Twelve ");
                    if (unitsdigit == 3) System.out.print("Thirteen");
                    if (unitsdigit == 4) System.out.print("Fourteen ");
                    if (unitsdigit == 5) System.out.print("Fifteen ");
                    if (unitsdigit == 6) System.out.print("Sixteen ");
                    if (unitsdigit == 7) System.out.print("Seventeen ");
                    if (unitsdigit == 8) System.out.print("Eighteen ");
                    if (unitsdigit == 9) System.out.print("Nineteen ");
                    break;
                case 2:
                    System.out.print("Twenty ");
                    break;
                case 3:
                    System.out.print("Thirty ");
                    break;
                case 4:
                    System.out.print("Forty ");
                    break;
                case 5:
                    System.out.print("Fifty ");
                    break;
                case 6:
                    System.out.print("Sixty ");
                    break;
                case 7:
                    System.out.print("Seventy ");
                    break;
                case 8:
                    System.out.print("Eighty ");
                    break;
                case 9:
                    System.out.print("Ninety ");
                    break;
            }
            if (tensdigit != 1) {
                switch (unitsdigit) {
                    default:
                        break;
                    case 1:
                        System.out.print("One");
                        break;
                    case 2:
                        System.out.print("Two");
                        break;
                    case 3:
                        System.out.print("Three");
                        break;
                    case 4:
                        System.out.print("Four");
                        break;
                    case 5:
                        System.out.print("Five");
                        break;
                    case 6:
                        System.out.print("Six");
                        break;
                    case 7:
                        System.out.print("Seven");
                        break;
                    case 8:
                        System.out.print("Eight");
                        break;
                    case 9:
                        System.out.print("Nine");
                        break;
                }
            }
        }
    }
}




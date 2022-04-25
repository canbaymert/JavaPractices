package _05_SwitchCase;

import java.util.Scanner;

public class C03_days {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Monday: 1\nTuesday : 2\nWednesday: 3\nThursday: 4\nFriday: 5\nSaturday: " +
                "6\nSunday: 7\nPlease enter the given number for the current day : ");
        int currentday = scan.nextInt();
        if (currentday <= 0 || currentday > 7) {
            System.out.println("Wrong input");
        } else
            System.out.print("How many days later : ");
        int howmanydays = scan.nextInt();
        int day = (howmanydays + currentday) % 7;
        switch (day) {
            case 1:
                System.out.println(howmanydays + " days later is Monday");
                break;
            case 2:
                System.out.println(howmanydays + " days later is Tuesday");
                break;
            case 3:
                System.out.println(howmanydays + " days later is Wednesday");
                break;
            case 4:
                System.out.println(howmanydays + " days later is Thursday");
                break;
            case 5:
                System.out.println(howmanydays + " days later is Friday");
                break;
            case 6:
                System.out.println(howmanydays + " days later is Saturday");
                break;
            case 0:
                System.out.println(howmanydays + " days later is Sunday");
                break;
            default:
                System.out.println("Wrong input");
        }
    }
}





package _05_SwitchCase;

import java.util.Scanner;

public class C01_letterGrade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your grade:");
        int grade= scanner.nextInt();
        char lettergrade = 'X';

        if (grade >= 0 && grade < 50) lettergrade = 'D';
        else if (grade >= 50 &&  grade < 60) lettergrade = 'C';
        else if (grade >= 60 &&  grade < 80) lettergrade = 'B';
        else if (grade >= 80 &&  grade < 100) lettergrade = 'A';

        switch (lettergrade) {
            case 'A':
            case 'B':
            case 'C':
            case 'D':
                System.out.println("Your letter grade: "+lettergrade);
                break;
            default: System.out.println("Please enter a grade between 0 and 100.");
                break;
        }
    }
}
package _17_exceptions;

import java.util.Scanner;

public class C01_averageOfExams {
    /* Create a method called "average" with two parameters (exam-1 and exam-2).
    Exam points should be between 0-100. Otherwise, system should throw ArithmeticException.
    Average method should take %40 of first exam and %60 of the second exam and sum.
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int exam1 = 0;
        int exam2 = 0;
        String str = "";

        while (true) {
            try {
                System.out.print("Enter the exam 1 score : ");
                exam1 = scan.nextInt();
                if (exam1 < 0 || exam1 > 100) {
                    throw new ArithmeticException();
                } else break;
            } catch (ArithmeticException e) {
                System.out.println("Score should be between 0 and 100");
            } catch (Exception e) {
                str = scan.next();
                System.out.println("Wrong input");
            }
        }

        while (true) {
            try {
                System.out.print("Enter the exam 2 score : ");
                exam2 = scan.nextInt();
                if (exam2 < 0 || exam2 > 100) {
                    throw new ArithmeticException();
                } else break;
            } catch (ArithmeticException e) {
                System.out.println("Score should be between 0 and 100");
            } catch (Exception e) {
                str = scan.next();
                System.out.println("Wrong input.");
            }
        }

        getAverageScore(exam1, exam2);

    }

    private static void getAverageScore(int exam1, int exam2) {
        double average = (exam1 * 0.40 + exam2 * 0.60);
        System.out.println("Average : " + average);
    }
}
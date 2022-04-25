package _05_SwitchCase;

import java.util.Scanner;

public class C04_ATM {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("    Welcome   ");
        System.out.print("Balance inquiry : 1\nWithdraw Cash : 2\nDeposit Cash : 3\nExit : 4\nYour Transaction : ");
        int transaction = scan.nextInt();
        int balance = 1000;
        switch (transaction) {
            case 1:
                System.out.println("current balance : " + balance);
                break;
            case 2:
                System.out.print("Enter the amount: ");
                int withdrawamount = scan.nextInt();
                if (withdrawamount > balance) {
                    System.out.println("Not enough balance in your account");
                } else {
                    balance -= withdrawamount;
                    System.out.println("Your current balance : " + balance);
                }
                break;
            case 3:
                System.out.print("Enter the amount: ");
                int depositamount = scan.nextInt();
                balance += depositamount;
                System.out.println("Your current balance : " + balance);
                break;
            case 4:
                System.out.println("Have a nice day");
                break;
        }
    }
}



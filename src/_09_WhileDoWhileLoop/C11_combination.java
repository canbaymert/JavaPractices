package _09_WhileDoWhileLoop;

import java.util.Scanner;

public class C11_combination {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Combination of n and r = C(n,r)\nn : ");
        int n = scan.nextInt();
        System.out.print("r : ");
        int r = scan.nextInt();
        int c = combination(n, r);
        System.out.println("Combination of n and r = C(n,r) = " + c);
    }

    public static int combination(int n, int r) {
        int nfactorial = 1;
        int rfactorial = 1;
        int difffactorial = 1;
        int diff = n - r;
        if (r > n) System.out.println("The value of r cannot be greater than the value of n.");
        else {
            if (n == 0) nfactorial = nfactorial;
            else {
                while (n >= 1) {
                    nfactorial *= n;
                    n--;
                }
            }
            if (r == 0) rfactorial = rfactorial;
            else {
                while (r >= 1) {
                    rfactorial *= r;
                    r--;
                }
            }
            if (diff == 0) difffactorial = difffactorial;
            else {
                while (diff >= 1) {
                    difffactorial *= diff;
                    (diff)--;
                }
            }

        }
        return nfactorial / (rfactorial * difffactorial);
    }
}

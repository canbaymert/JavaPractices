package _10_Arrays;
import java.util.Arrays;
import java.util.Scanner;

public class C01_maxMinDiff {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the length of the array");
        int arrlength = scan.nextInt();
        int[] Arr = new int[arrlength];
        for (int i = 0; i < arrlength; i++) {
            System.out.print("Entry number " + i + " : ");
            Arr[i] = scan.nextInt();
        }
        Arrays.sort(Arr);
        int min = Arr[0];
        int max = Arr[arrlength - 1];
        System.out.println("The differance between the maximum and the minimum entry = " + (max - min));
    }
}


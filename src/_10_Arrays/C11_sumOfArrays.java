package _10_Arrays;

public class C11_sumOfArrays {
    public static void main(String[] args) {
        int[][] arr1 = {{1, 2}, {3, 4, 5}, {6}};
        int[][] arr2 = {{7, 8, 9}, {10, 11}, {12}};
        int sum = 0;

        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {
                sum += arr1[i][j];
            }
        }

        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr2[i].length; j++) {
                sum += arr2[i][j];
            }
        }
        System.out.println("Sum of all numbers in the given arrays: " + sum);
    }
}


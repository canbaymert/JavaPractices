package _10_Arrays;

import java.util.Arrays;

public class C02_sumOfInnerArray {
    public static void main(String[] args) {
        int[][] arr1 = {{10,20,30},{4},{6,7,20}};
        int[] arr2 =new int[arr1.length];
        int sum=0;
        for (int i = 0; i <arr1.length ; i++) {
            for (int j = 0; j <arr1[i].length ; j++) {
                sum+=arr1[i][j];
            }
            arr2[i]+=sum;
            sum=0;
        }
        System.out.println(Arrays.toString(arr2));
    }
}

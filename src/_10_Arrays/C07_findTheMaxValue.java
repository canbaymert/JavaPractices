package _10_Arrays;

public class C07_findTheMaxValue {
    //Find the number with the max value in a multidimensional array.
    public static void main(String[] args) {
        int[][] arr1 = {{1, 2, -3}, {41, 55}, {-61, -17, 80}};
        findthemaxvalue(arr1);
    }

    private static void findthemaxvalue(int[][] arr1) {
        int maxvalue = 0;
        for (int i = 1; i < arr1.length; i++) {
            for (int j = 1; j < arr1[i].length; j++) {
                if (arr1[i - 1][j - 1] <= arr1[i][j]) maxvalue = arr1[i][j];
                else maxvalue = arr1[i - 1][j - 1];
            }
        }
        System.out.println("Number with the max value : " + maxvalue);
    }
}


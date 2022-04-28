package _10_Arrays;

public class C05_averageValue {
    public static void main(String[] args) {
        //Find the average value of an array and print the numbers which are higher than the average.
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        float sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        float average = sum / arr.length;
        System.out.println("Average value of the numbers : " + average);
        System.out.print("Numbers that are higher than the average : ");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > average) System.out.print(arr[i] + " ");
        }
    }
}

package _10_Arrays;

public class C13_isSymmetrical {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5, 4, 3, 2, 1};
        boolean isSymmetrical = true;
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr1[arr1.length - 1 - i]) {
                isSymmetrical = false;
                break;
            }
        }
        if (isSymmetrical) {
            System.out.println("The array is symmetrical.");
        } else System.out.println("The array is not symmetrical.");
    }
}

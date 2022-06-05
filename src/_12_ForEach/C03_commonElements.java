package _12_ForEach;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C03_commonElements {
    public static void main(String[] args) {
        String[] array1 = {"Apple", "Banana", "Pineapple", "Orange"};
        String[] array2 = {"Pineapple", "Grape", "Lemon", "Pear", "Raspberry", "Apple"};
        System.out.println("Array 1 : " + Arrays.toString(array1));
        System.out.println("Array 2 : " + Arrays.toString(array2));
        List<String> commonelements = new ArrayList<>();
        for (String each1 : array1
        ) {
            for (String each2 : array2
            ) {
                if (each1.equals(each2)) {
                    commonelements.add(each2);
                }
            }
        }
        if (commonelements.isEmpty()) {
            System.out.println("There are no common elements");
        } else {
            System.out.println("The common elements of the both arrays : " + commonelements);
        }
    }
}


package _11_List;

import java.util.Arrays;
import java.util.List;

public class C09_replaceTheElements {
    // Replace the 8th and 3rd elements of a list
    public static void main(String[] args) {
        String[] fruits = {"Apple", "Strawberry", "Melon", "Kiwi", "Pineapple", "Banana", "Plum", "Orange", "Cherry", "Peach"};
        System.out.println(Arrays.toString(fruits));
        List<String> fruitsList = Arrays.asList(fruits);
        String temp = "";
        temp = fruitsList.get(2);
        fruitsList.set(2, fruitsList.get(7));
        fruitsList.set(7, temp);
        for (int i = 0; i < 10; i++) {
            fruits[i] = fruitsList.get(i);
        }
        System.out.println(Arrays.toString(fruits));
    }
}
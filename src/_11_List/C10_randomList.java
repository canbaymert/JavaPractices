package _11_List;

import java.util.ArrayList;

public class C10_randomList {
    // Create a list with 10 elements that includes random values between 1 and 20. If element is an even number replace it with "1".
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        randomlist(list);
    }

    private static void randomlist(ArrayList<Integer> list) {
        for (int i = 0; i < 10; i++) {
            list.add((int) (Math.random() * 20 + 1));
        }
        System.out.println("Random List : " + list);
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) % 2 == 0) {
                list.set(i, 1);
            }
        }
        System.out.println("Replaced Random List : " + list);
    }
}
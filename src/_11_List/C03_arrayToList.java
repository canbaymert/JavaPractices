package _11_List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class C03_arrayToList {
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<>();
        String arr1[][] = {{"Apple", "Strawberry", "Melon"}, {"Kiwi", "Pineapple"}, {"Banana"}};
        list1 = d2arraytolist(arr1);
        System.out.println(list1);
    }

    public static List<String> d2arraytolist(String[][] arr1) {
        List<String> list = new ArrayList<>();
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {
                list.add(arr1[i][j]);
            }
            Collections.sort(list);
        }
        return list;
    }
}


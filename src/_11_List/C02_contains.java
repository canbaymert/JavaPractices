package _11_List;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class C02_contains {
    /*

    Remove the elements that includes the letter 'a' from a list

     */

    public static void main(String[] args) {
        List<String> list1 = new ArrayList<>();
        list1.add("Apple");
        list1.add("Strawberry");
        list1.add("Melon");
        list1.add("Kiwi");
        list1.add("Pineapple");

        list1 = removeelementswitha(list1);
        System.out.println(list1);
    }

    private static List<String> removeelementswitha(List<String> list1) {
        List<String> list = new ArrayList<>();
        for (int i = 0; i < list1.size(); i++) {
            if (!list1.get(i).toLowerCase(Locale.ROOT).contains("a")) {
                list.add(list1.get(i));
            }
        }
        return list;
    }
}



package _19_Set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class C03_arrayListToSet {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        HashSet<Integer> set = new HashSet<Integer>(list);

        addElement(list);
        System.out.println("Random ArrayList = " + list);
        set = arrayListToSet(list);
        System.out.println("ArrayList converted to HashSet = " + set);
        list = setToArrayList(set);
        System.out.println("HashSet converted to ArrayList = " + list);

    }

    public static HashSet<Integer> arrayListToSet(ArrayList<Integer> list) {
        HashSet<Integer> set = new HashSet<Integer>(list);
        return set;
    }

    public static ArrayList<Integer> setToArrayList(Set<Integer> set) {
        ArrayList<Integer> list = new ArrayList<Integer>(set);
        return list;
    }


    private static void addElement(ArrayList<Integer> list) {
        Random rnd = new Random();
        for (int i = 0; i < 30; i++) {
            list.add(rnd.nextInt(10));
        }
    }
}




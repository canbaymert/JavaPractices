package _19_set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class C06_charSet {
    //  PART 1
    // create a method that accepts ArrayList<Integer> and Set<Integer> as parameters
    // and add all elements from ArrayList to Set

    // PART 2
    // create a method that takes Set<Character> and varargs of char as parameters
    // and adds all chars to the set

    public static void main(String[] args) {
       //PART 1
       
        ArrayList<Integer> arrList = new ArrayList<>();
        arrList.add(10);
        arrList.add(20);
        arrList.add(30);
        arrList.add(10);
        arrList.add(20);
        arrList.add(50);
        System.out.println(arrList);

        Set<Integer> set = new HashSet<>();
        arrListToSet(arrList,set);
        System.out.println(set);

        //PART 2

        Set<Character> characterSet = new HashSet<>();
        addCharsToSet(characterSet,'A', 'B', 'R', 'r', 'q'  );

        System.out.println(characterSet);
    }

    private static void addCharsToSet(Set<Character> characterSet,Character ...chars) {
        for (int i =0; i<chars.length; i++){
            characterSet.add(chars[i]);
        }
    }
    private static void arrListToSet(ArrayList<Integer> arrList, Set<Integer> set) {
        set.addAll(arrList);
    }
}


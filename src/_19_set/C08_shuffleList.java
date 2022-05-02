package _19_set;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class C08_shuffleList {
    // part 1: create list of 5 numbers from user input
    // sort the list in reverse order and print it
    // shuffle the list and print it
    // rotate right by 3 places and print it

    // part 2: find the max number and min number, print them
    // replace all max number with min number

    public static void main(String[] args) {

        ArrayList<Integer> arrList = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < 5; i++){
            System.out.print("Enter a num : ");
            arrList.add(scan.nextInt());
        }

        arrList.sort(Collections.reverseOrder()); //Collections.sort(arrList,Collections.reverseOrder());
        System.out.println(arrList); //[5, 4, 3, 2, 1]

        Collections.shuffle(arrList);
        System.out.println(arrList); //[2, 3, 5, 4, 1]

        Collections.rotate(arrList,3);
        System.out.println(arrList); //[5, 4, 1, 2, 3]

        Integer max = Collections.max(arrList);
        Integer min = Collections.min(arrList);
        System.out.println(max);
        System.out.println(min);

        Collections.replaceAll(arrList,max,min);
        System.out.println(arrList);  //[1, 4, 1, 2, 3]

    }
}



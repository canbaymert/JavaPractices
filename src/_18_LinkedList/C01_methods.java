package _18_LinkedList;
import java.util.Arrays;
import java.util.LinkedList;

public class C01_methods {
    public static void main(String[] args) {
        // Mutable no need to assign

        LinkedList<String> ll1 = new LinkedList<>(Arrays.asList("apple", "banana", "pineapple", "plum", "strawberry"));

        System.out.println(ll1); // [apple, banana, pineapple, plum, strawberry]

        ll1.add("peach");
        System.out.println(ll1); // [apple, banana, pineapple, plum, strawberry, peach]

        ll1.add(2, "orange");
        System.out.println(ll1); // [apple, banana, orange, pineapple, plum, strawberry, peach]

        LinkedList<String> ll2 = new LinkedList<>(Arrays.asList("xxx", "yyy"));

        ll1.addAll(ll2);
        System.out.println(ll1); // [apple, banana, orange, pineapple, plum, strawberry, peach, xxx, yyy]

        ll1.addFirst("lemon");
        System.out.println(ll1); // [lemon, apple, banana, orange, pineapple, plum, strawberry, peach, xxx, yyy]

        ll1.addLast("tomato");
        System.out.println(ll1); // [lemon, apple, banana, orange, pineapple, plum, strawberry, peach, xxx, yyy, tomato]

        ll1.addAll(3, ll2);
        System.out.println(ll1); // [lemon, apple, banana, xxx, yyy, orange, pineapple, plum, strawberry, peach, xxx, yyy, tomato]

        ll1.remove();
        System.out.println(ll1); // [apple, banana, xxx, yyy, orange, pineapple, plum, strawberry, peach, xxx, yyy, tomato]

        ll1.removeFirst();
        System.out.println(ll1); // [banana, xxx, yyy, orange, pineapple, plum, strawberry, peach, xxx, yyy, tomato]

        ll1.remove("orange");
        System.out.println(ll1); // [banana, xxx, yyy, pineapple, plum, strawberry, peach, xxx, yyy, tomato]

        ll1.remove(2);
        System.out.println(ll1); // [banana, xxx, pineapple, plum, strawberry, peach, xxx, yyy, tomato]

        ll1.removeFirstOccurrence("xxx");
        System.out.println(ll1); // [banana, pineapple, plum, strawberry, peach, xxx, yyy, tomato]

        ll1.add(3, "xxx");
        ll1.removeLastOccurrence("xxx");
        System.out.println(ll1); // [banana, pineapple, plum, xxx, strawberry, peach, yyy, tomato]

        LinkedList<Integer> ll3 = new LinkedList<>(Arrays.asList(1, 2, 3, 4, 5, 6));
        ll3.remove(2);
        System.out.println(ll3); // [1, 2, 4, 5, 6]

        ll3.remove(ll3.indexOf(6));

        System.out.println(ll3); // [1, 2, 4, 5]


        ll1.removeAll(ll2);
        System.out.println(ll1); // [banana, pineapple, plum, strawberry, peach, tomato]
        System.out.println(ll2); // [xxx, yyy]


        System.out.println(ll1.offer("cherry")); // true
        System.out.println(ll1); // [banana, pineapple, plum, strawberry, peach, tomato, cherry]
        ll1.offerLast("apricot"); // adds but returns nothing
        ll1.offerFirst("melon");
        System.out.println(ll1); // [melon, banana, pineapple, plum, strawberry, peach, tomato, cherry, apricot]

        System.out.println(ll1.element()); // melon (returns first element but throws exception if there is no first element)
        System.out.println(ll1.peek()); // melon  (returns first element but returns null if there is no first element)

        //ll3.remove(33);
        //System.out.println(ll3);//IndexOutOfBoundsException

        System.out.println(ll1.get(4)); // strawberry
        System.out.println(ll1.poll()); //removes first element and returns that element
        System.out.println(ll1); //[banana, pineapple, plum, strawberry, peach, tomato, cherry, apricot]

    }
}



package _12_ForEach;

public class C02_printList {
    // print list with for each loop
    // print length of each element

    // Part 2:
    // Print all the elements from list using for eachLoop
    // If an element starts with 'v' then quit the loop

    public static void main(String[] args) {

        String[] list = {"fruits", "vegetables", "meat", "milk"};
        System.out.println("Part I");
        for (String element : list
        ) {
            System.out.print("\n" + element + " : " + element.length() + " ");
        }
        System.out.println("\n");
        System.out.println("Part II\n");

        for (String item : list
        ) {
            if (item.startsWith("v")) {
                break;
            }
            System.out.println(item);
        }
    }
}



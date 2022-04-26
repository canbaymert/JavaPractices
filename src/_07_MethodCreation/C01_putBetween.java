package _07_MethodCreation;

public class C01_putBetween {
    public static void main(String[] args) {
        String entry1 = "Beer";
        String entry2 = "Cold";
        putBetween(entry1, entry2);
    }

    public static void putBetween(String name1, String name2) {
        int name1size = name1.length();
        if (name1size % 2 == 0) {
            System.out.println(name1.substring(0, name1size / 2) + (name2) +
                    name1.substring((name1size / 2), name1.length()));
        } else {
            System.out.println(name1 + " doesn't have an even number of letters");
        }
    }
}

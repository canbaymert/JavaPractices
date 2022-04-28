package _10_Arrays;

import java.util.Arrays;

public class C08_PoundsAndDollars {
    //Find the sum of the dollar and pound values separately.

    public static void main(String[] args) {

        String str = "$1 $23 $134 $2 $7 $24 £32 £40 £2 £65 £4";
        String[] Arr = str.split(" ");
        int totaldollars = 0;
        int totalpounds = 0;
        for (int i = 0; i < Arr.length; i++) {
            if (Arr[i].contains("$")) {
                Arr[i] = Arr[i].replace("$", "");
                totaldollars += Integer.parseInt(Arr[i]);
            }
            if (Arr[i].contains("£")) {
                Arr[i] = Arr[i].replace("£", "");
                totalpounds += Integer.parseInt(Arr[i]);
            }
        }
        System.out.println("Toplam " + totaldollars + " $");
        System.out.println("Toplam " + totalpounds + " £");
    }
}



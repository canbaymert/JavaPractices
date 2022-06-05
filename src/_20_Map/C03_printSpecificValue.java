package _20_Map;

import java.util.*;

public class C03_printSpecificValue {
    /*
    map {101=Joe, Cole, England, 102=Zinedine, Zidane, France, 103=Steven, Gerrard, England}
    Chosen birthplace  England
    Result  [Joe, Gary]
     */
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(101, "Joe, Cole, England");
        map.put(102, "Zinedine, Zidane, France");
        map.put(103, "Steven, Gerrard, England");
        String chosenbirthplace = "England";
        List<String> listofEnglish = createSpecificMap(map, chosenbirthplace);
        System.out.println(listofEnglish);
    }

    public static List<String> createSpecificMap(Map<Integer, String> map1, String chosenbirthplace) {
        List<String> listofEnglish = new ArrayList<>();
        Collection<String> values = map1.values();
        List<String> valueList = new ArrayList<>();
        valueList.addAll(values);
        int outerArraySize = valueList.size();
        String firstValue = valueList.get(0);
        String firstValuearr[] = firstValue.split(", ");
        int innerArraySize = firstValuearr.length;
        String valueMDArr[][] = new String[outerArraySize][innerArraySize];
        for (int i = 0; i < outerArraySize; i++) {
            String temp[] = valueList.get(i).split(", ");
            for (int j = 0; j < innerArraySize; j++) {
                valueMDArr[i][j] = temp[j];
            }
        }
        System.out.println(Arrays.deepToString(valueMDArr));
        for (int i = 0; i < outerArraySize; i++) {
            if (valueMDArr[i][2].equals(chosenbirthplace)) {
                listofEnglish.add(valueMDArr[i][0]);
            }
        }
        return listofEnglish;
    }
}

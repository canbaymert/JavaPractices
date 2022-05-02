package _20_map;

import java.util.*;

public class C04_findTheSize {

    // create a map with groupName as key and groupMembers as value
    // "Group1" = ["Member1", "Member2"]
    // "Group2" = ["Member3", "Member4", "Member5"]
    // find how many members each group has

    public static void main(String[] args) {
        HashMap<String, ArrayList<String>> map = new HashMap<>();

        ArrayList<String> group1 = new ArrayList<>(Arrays.asList("Member1", "Member2"));
        ArrayList<String> group2 = new ArrayList<>(Arrays.asList("Member3", "Member4", "Member5"));

        map.put("Group1", group1);
        map.put("Group2", group2);

        System.out.println(map); //{Group1=[Member1, Member2], Group2=[Member3, Member4, Member5]}


        Collection<ArrayList<String>> values = map.values();
        for (ArrayList<String> each : values) {
            System.out.println(each.size());
        }
        //Alternative Solution

        Set<String> keys = map.keySet();
        for (String key : keys) {
            ArrayList<String> groupList = map.get(key);
            System.out.println(groupList.size());
        }
    }
}

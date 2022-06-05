package _20_Map;

import java.util.TreeMap;

public class C02_treeMapMethods {
    public static void main(String[] args) {
        TreeMap<Integer, String> tm = new TreeMap<>();
        tm.put(105, "bbb");
        tm.put(104, "aaa");
        tm.put(102, "yyy");
        tm.put(103, "zzz");
        tm.put(101, "xxx");

        System.out.println(tm); //{101=xxx, 102=yyy, 103=zzz, 104=aaa, 105=bbb}

        tm.put(106, "ttt");
        System.out.println(tm); //{101=xxx, 102=yyy, 103=zzz, 104=aaa, 105=bbb, 106=ttt}
        System.out.println(tm.ceilingKey(101));// 101

        System.out.println(tm.ceilingKey(111));//null

        System.out.println(tm.ceilingEntry(0));//101=xxx (there is no entry at key:0 prints first key after 0)
        System.out.println(tm.floorEntry(999));//106=ttt (there is no entry at key:999 prints first key before 999)
        System.out.println(tm.floorKey(999)); //106

        System.out.println(tm.descendingKeySet()); //[106, 105, 104, 103, 102, 101]
        System.out.println(tm.keySet()); //[101, 102, 103, 104, 105, 106]

        System.out.println(tm.headMap(108));//{101=xxx, 102=yyy, 103=zzz, 104=aaa, 105=bbb, 106=ttt}
        System.out.println(tm.headMap(104)); //{101=xxx, 102=yyy, 103=zzz}
        System.out.println(tm.headMap(104, true)); //{101=xxx, 102=yyy, 103=zzz, 104=aaa}

        System.out.println(tm.tailMap(102)); //{102=yyy, 103=zzz, 104=aaa, 105=bbb, 106=ttt}
        System.out.println(tm.tailMap(102, false)); //{103=zzz, 104=aaa, 105=bbb, 106=ttt}

    }
}



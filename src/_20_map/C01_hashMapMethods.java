package _20_map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class C01_hashMapMethods {
    public static void main(String[] args) {

        HashMap<Integer, String> m1 = new HashMap<>();
        m1.put(101, "Antonio");
        m1.put(102, "Cesar");
        m1.put(103, "N'Golo");
        m1.put(104, "Mason");
        m1.put(105, "Kai");
        System.out.println(m1); // {101=Antonio, 102=Cesar, 103=N'Golo, 104=Mason, 105=Kai}

        m1.put(101, "Thiago");
        System.out.println(m1); // {101=Thiago, 102=Cesar, 103=N'Golo, 104=Mason, 105=Kai}

        m1.put(106, "Timo");
        System.out.println(m1); // {101=Thiago, 102=Cesar, 103=N'Golo, 104=Mason, 105=Kai, 106=Timo}

        m1.put(null, "Edouard");
        System.out.println(m1); // {null=Edouard, 101=Thiago, 102=Cesar, 103=N'Golo, 104=Mason, 105=Kai, 106=Timo}

        m1.put(107, null);
        m1.put(108, null);
        m1.put(109, null);
        System.out.println(m1); // {null=Edouard, 101=Thiago, 102=Cesar, 103=N'Golo, 104=Mason, 105=Kai, 106=Timo, 107=null, 108=null, 109=null, 110=ahmet}

        System.out.println(m1.get(103)); // N'Golo
        System.out.println(m1.values()); // [Edouard, Thiago, Cesar, N'Golo, Mason, Kai, Timo, null, null, null]

        System.out.println(m1.keySet()); // [null, 101, 102, 103, 104, 105, 106, 107, 108, 109]
        System.out.println(m1.entrySet()); // [null=Edouard, 101=Thiago, 102=Cesar, 103=N'Golo, 104=Mason, 105=Kai, 106=Timo, 107=null, 108=null, 109=null]


        System.out.println(m1.getOrDefault(106, "There is no such value")); // Timo
        System.out.println(m1.getOrDefault(111, "There is no such value")); // There is no such value

        System.out.println(m1.putIfAbsent(110, "Reece")); // null
        System.out.println(m1.putIfAbsent(110, "Reece"));// Reece
        System.out.println(m1); //{null=Edouard, 101=Thiago, 102=Cesar, 103=N'Golo, 104=Mason, 105=Kai, 106=Timo, 107=null, 108=null, 109=null, 110=Reece}

        System.out.println(m1.putIfAbsent(105, "Hakim"));// Kai
        System.out.println(m1); // {null=Edouard, 101=Thiago, 102=Cesar, 103=N'Golo, 104=Mason, 105=Kai, 106=Timo, 107=null, 108=null, 109=null, 110=Reece}

        System.out.println(m1.putIfAbsent(107, "Mateo")); //null
        System.out.println(m1); // {null=Edouard, 101=Thiago, 102=Cesar, 103=N'Golo, 104=Mason, 105=Kai, 106=Timo, 107=Mateo, 108=null, 109=null, 110=Reece}

        m1.remove(110);
        m1.remove(110);
        System.out.println(m1); //{null=Edouard, 101=Thiago, 102=Cesar, 103=N'Golo, 104=Mason, 105=Kai, 106=Timo, 107=Mateo, 108=null, 109=null}
        System.out.println(m1.remove(102, "Ben")); //false
        System.out.println(m1); //{null=Edouard, 101=Thiago, 102=Cesar, 103=N'Golo, 104=Mason, 105=Kai, 106=Timo, 107=Mateo, 108=null, 109=null}
        System.out.println(m1.remove(102, "Cesar")); //true
        System.out.println(m1); //{null=Edouard, 101=Thiago, 103=N'Golo, 104=Mason, 105=Kai, 106=Timo, 107=Mateo, 108=null, 109=null}

        System.out.println(m1.size()); // 9

        HashMap<Integer, String> m2 = new HashMap<>();
        m2.put(1, "xxx");
        m2.put(2, "yyy");
        m2.put(3, "zzz");
        m1.putAll(m2);
        System.out.println(m1); // {null=Edouard, 1=xxx, 2=yyy, 3=zzz, 101=Thiago, 103=N'Golo, 104=Mason, 105=Kai, 106=Timo, 107=Mateo, 108=null, 109=null}

        //Print
        Set<Integer> keySet = m1.keySet();
        Collection<String> valueSet = m1.values();
        System.out.println(keySet); // [null, 1, 2, 3, 101, 103, 104, 105, 106, 107, 108, 109]
        for (String each : valueSet
        ) {
            System.out.println(each);
        }
        System.out.println();

        System.out.println(m2); //{1=xxx, 2=yyy, 3=zzz}
        m2.compute(1, (key, value) -> "aaa");
        System.out.println(m2); //{ {1=aaa, 2=yyy, 3=zzz}

        m2.compute(999, (key, value) -> "bbb");
        System.out.println(m2); //{1=aaa, 2=yyy, 3=zzz, 999=bbb}

        m2.computeIfAbsent(1, value -> "ccc"); //no action
        System.out.println(m2); //{1=aaa, 2=yyy, 3=zzz, 999=bbb}

        m2.computeIfAbsent(9999, value -> "ddd");
        System.out.println(m2);//{1=aaa, 2=yyy, 3=zzz, 999=bbb, 9999=ddd}

        m2.computeIfPresent(1, (key, value) -> "fff");
        System.out.println(m2); //{1=fff, 2=yyy, 3=zzz, 999=bbb, 9999=ddd}

        m2.computeIfPresent(99999, (key, value) -> "rabia"); //no action
        System.out.println(m2); //{1=fff, 2=yyy, 3=zzz, 999=bbb, 9999=ddd}

    }
}




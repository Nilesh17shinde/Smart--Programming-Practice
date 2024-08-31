package Java8Features.ListInterface;

import java.util.*;

public class MainDemo1 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(9);
        list.add(5);
        list.add(15);
        list.add(51);
        list.add(6);
        list.add(2);
        Collections.sort(list, (a, b) -> b - a);
        System.out.println(list);
        System.out.println("---------------------------------------------------------");
        Set<Integer> set = new TreeSet<>();
        set.add(10);
        set.add(15);
        set.add(1);
        set.add(19);
        set.add(5);
        set.add(12);
        set.add(2);
        set.add(13);
        set.add(10);
        set.add(7);
        set.add(28);
        set.add(20);
        System.out.println(set);

        Set<Integer> set1 = new TreeSet<>((a,b)->b-a);
        set1.add(10);
        set1.add(15);
        set1.add(1);
        set1.add(19);
        set1.add(5);
        set1.add(12);
        set1.add(2);
        set1.add(13);
        set1.add(10);
        set1.add(7);
        set1.add(28);
        set1.add(20);
        System.out.println(set1);
        System.out.println("-----------------------------------------------");

        Map<Integer,String> stringMap=new TreeMap<>();
        stringMap.put(2,"Nilesh");
        stringMap.put(5,"Deva");
        stringMap.put(1,"Shraddha");
        stringMap.put(3,"Trupti");

        System.out.println(stringMap);

        Map<Integer,String> stringMap1=new TreeMap<>((a,b)->b-a);
        stringMap1.put(2,"Nilesh");
        stringMap1.put(5,"Deva");
        stringMap1.put(1,"Shraddha");
        stringMap1.put(3,"Trupti");
        stringMap1.put(4,"Trupti D");

        System.out.println(stringMap1);
    }
}

package CollectionFramework.MapInterface;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<Integer,String> map=new HashMap<>();
        map.put(101,"Nilesh");
        map.put(102,"Shraddha");
        map.put(103,"Deva");
        map.put(104,"Vikas");
        map.put(105,"Gaurav");
        System.out.println(map);
        System.out.println("----------------------------------------------------");
        HashMap<Integer,String>hashMap=new HashMap<>();
        hashMap.put(1,"aaa");
        hashMap.put(2,"bbb");
        hashMap.putAll(map);
        System.out.println(hashMap);
        System.out.println("-----------------------------------------------------");
        System.out.println(hashMap.size());
        System.out.println("------------------------------------------------------");
        System.out.println(hashMap.clone());
        System.out.println("--------------------------------------------------------");
        /*Set set=map.entrySet();
        Iterator iterator= set.iterator();
        while (iterator.hasNext()){
            Map.Entry entry=(Map.Entry)iterator.next();
            System.out.println(entry.getKey()+"->"+entry.getValue());
//            System.out.println(iterator.next());
        }*/
        for (Map.Entry entry: map.entrySet()){
            System.out.println(entry.getKey()+"->"+entry.getValue());
        }

    }
}

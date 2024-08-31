package CollectionFramework.SetCollection;

import java.util.ArrayList;
import java.util.HashSet;

public class HashSetDemo {
    public static void main(String[] args) {
        ArrayList list=new ArrayList<>();
        list.add("Shubhal");
        list.add("Deva");
        list.add(10);
        list.add(30);
        HashSet hashSet=new HashSet<>();
        hashSet.addAll(list);
        hashSet.add("Nilesh");
        hashSet.add("Shraddha");
        hashSet.add(10);
        hashSet.add(10);
        hashSet.add(20);
        System.out.println(hashSet);
        hashSet.forEach(e->{
            System.out.print(e+" ");
        });
    }
}

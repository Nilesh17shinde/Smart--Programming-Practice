package CollectionFramework.ListCollection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class DemoSet {
    public static void main(String[] args) {
        Set set=new HashSet<>();
        set.add("Nilesh");
        set.add(10);
        set.add(50);
        set.add("Shraddha");

        System.out.print(set+" ");
        System.out.println();
/*//        Iterate data using forEach
        set.forEach(e->{
            System.out.println(e);
        });*/

//        using Iterator
        Iterator iterator= set.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}

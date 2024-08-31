package CollectionFramework.ListCollection;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class DemoList {
    public static void main(String[] args) {
        List list=new ArrayList<>();
        list.add(100);
        list.add(200);
        list.add(300);
        list.add("Nilesh");
        list.add("Deva");

        System.out.print(list+" ");
        System.out.println();
        //  Using List Iterator
       /* ListIterator li= list.listIterator();
        while (li.hasNext()){
            System.out.println(li.next());
        }
        System.out.println("----------------------------------------------------");
//        ListIterator li= list.listIterator();
        while (li.hasPrevious()){
            System.out.println(li.previous());
        }*/
/*//        using Iterator
        Iterator itr= list.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }*/

/*//        Using for each
        list.forEach(e->{
            System.out.println(e);
        });*/
        System.out.println("-------------------------------------------------");
        ListIterator iterator= list.listIterator(list.size());
        while (iterator.hasPrevious()){
            System.out.println(iterator.previous());
        }
    }
}

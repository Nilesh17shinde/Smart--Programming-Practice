package CollectionFramework.ListCollection;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList list=new ArrayList<>();
        list.add(10);
        list.add("Nilesh");
        list.add(30);
        list.add("Shraddha");
        list.add(50);
        System.out.print(list);
        System.out.println("----------------------------------------------");
        System.out.println(list.indexOf("Shraddha"));
        System.out.println(list.set(4,60));
        System.out.println(list);
//        list .clear();

        System.out.println(list.contains("Shraddha"));
        ArrayList list1=new ArrayList<>();
        list1.add("Nilesh");
        list1.add(10);
        list1.add(70);
        list1.add(60);
        System.out.println(list1);
        list1.addAll(list);
        System.out.println(list1);
       /* list1.removeAll(list);
        System.out.println(list1);*/
        System.out.println("--------------iterate lambda exception---------------------");
        list1.forEach(e->{
            System.out.print(e+" ");
        });
        System.out.println();
        System.out.println("--------------iterate Iterator-------------");
        Iterator iterator=list1.iterator();
        while (iterator.hasNext()){
            System.out.print(iterator.next()+" ");
        }
    }
}

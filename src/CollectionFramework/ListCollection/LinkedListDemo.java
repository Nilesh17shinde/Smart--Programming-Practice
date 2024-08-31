package CollectionFramework.ListCollection;

import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList list=new LinkedList<>();
        list.add(10);
        list.add(50);
        list.add(60);
        list.add(800);
        list.add(80);
        list.add(30);
        list.add("Nilesh");
        System.out.println(list);
        System.out.println("--------------------------------------------");
        System.out.println(list.get(5));
        list.addFirst("Shraddha");
        System.out.println(list);
        System.out.println("-------------------------------------------");
        System.out.println(list.getLast());
        System.out.println(list.getFirst());
        list.set(3,89);
        System.out.println(list);
        System.out.println("-------------------------------------------------------");
        /*ListIterator iterator= list.listIterator();
        while (iterator.hasNext()){
            System.out.print(iterator.next()+" ");
        }*/

        ListIterator iterator= list.listIterator(list.size());
        while (iterator.hasPrevious()){
            System.out.print(iterator.previous()+" ");
        }
        System.out.println();
        System.out.println("-------------------------------------------");
        list.forEach(e->{
            System.out.print(e+" ");
        });
    }
}

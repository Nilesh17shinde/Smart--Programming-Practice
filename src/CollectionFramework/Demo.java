package CollectionFramework;
import java.util.*;
public class Demo {
    public static void main(String[] args) {
        System.out.println("Collection Fremwork ");

//        Type safe collection
        ArrayList<String>list=new ArrayList<>();
        list.add("Nilesh");
        list.add("Shinde");
        list.add("pune");
        System.out.println(list);
        System.out.println(list.get(0));
        list.add(3,"pune 411027");
        System.out.println(list);

//        Non type safe
        System.out.println("----------------------------------------------------------------------");
        LinkedList linkedList=new LinkedList<>();
        linkedList .add("Nilesh");
        linkedList .add(411027);
        System.out.println(linkedList);
    }
}

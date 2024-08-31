package CollectionFramework.Practice;

import java.util.LinkedList;
import java.util.List;

public class DemoLinkedList {
    public static void main(String[] args) {
        List<String> linkedList=new LinkedList<>();
        linkedList.add("Nilesh Shinde");
        linkedList.add("Pune");
        linkedList.add("Maharashtra");
        System.out.println(linkedList);
        System.out.println("Element at index 1: "+linkedList.get(1));
        linkedList.remove(1);
        linkedList.add("Nagpur");
        linkedList.add("411037");
        System.out.println(linkedList);
    }
}

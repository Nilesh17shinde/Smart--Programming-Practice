package CollectionFramework.Practice;

import java.util.ArrayList;
import java.util.List;

public class DemoArrayList {
    public static void main(String[] args) {
        List<String> arrayList=new ArrayList<>();
        arrayList.add("Nilesh");
        arrayList.add("Pune");
        arrayList.add("411037");
        System.out.println("ArrayList: "+arrayList);
        System.out.println("Size: "+arrayList.size());
        System.out.println("Element at index 1: "+arrayList.get(1));
        arrayList.remove(1);
        arrayList.add("Nagpur");
        arrayList.add("Maharashtra");
        System.out.println("ArrayList: "+arrayList);
    }
}

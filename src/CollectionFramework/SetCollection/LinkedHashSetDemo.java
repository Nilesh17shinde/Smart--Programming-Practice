package CollectionFramework.SetCollection;

import java.util.LinkedHashSet;

public class LinkedHashSetDemo {
    public static void main(String[] args) {
        LinkedHashSet hashSet=new LinkedHashSet<>();
        hashSet.add("Nilesh");
        hashSet.add("Deva");
        hashSet.add("85");
        hashSet.add(78);
        hashSet.add(75);
        hashSet.add(98);
//        hashSet.clear();
        System.out.println(hashSet.spliterator());

        System.out.println(hashSet.hashCode());
        System.out.println(hashSet.clone());//copy objects

        System.out.println(hashSet.size());
        System.out.println(hashSet.contains(78));
        hashSet.remove(78);
        System.out.println(hashSet);
    }
}

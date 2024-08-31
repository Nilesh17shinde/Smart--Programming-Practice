package Java8Features.Practice;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class TestList {
    public static void main(String... programmingKT) {
//        List<Integer>list=new LinkedList<>();
//        list.add(1);
//        list.add(2);
//        list.add(3);
//
//        List<Integer> subList=new LinkedList<>(list.subList(1,2));
//        System.out.println(subList);

        List<Integer>list= Arrays.asList(1,2,3,4,5);
        List<Integer>list1=new LinkedList<>(list);
        list1.subList(1,3).clear();
        System.out.println(list1);
    }
}

package Java8Features.Practice;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<Integer> l= Arrays.asList(1,2,3,4,5);
        List<Integer> list=new LinkedList<>(l);
        list.subList(1,3).clear();
        System.out.println(list);
    }
}

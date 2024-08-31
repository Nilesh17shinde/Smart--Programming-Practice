package Java8Features.Practice;

import java.util.ArrayList;
import java.util.Collections;

public class SortExample {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(10);
        list.add(6);
        list.add(15);
        list.add(4);
        list.sort((a,b)->b-a);
        System.out.println(list);
    }
}

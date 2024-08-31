package Java8Features.comparatorExample;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingExample {
    public static void main(String[] args) {
        List<Employee> list=new ArrayList<>();
        list.add(new Employee(102,"Nilesh","Pune","9883869585"));
        list.add(new Employee(105,"Gauri","Kharadi","925868584"));
        list.add(new Employee(107,"Tukaram","kannad","9885489685"));
        list.add(new Employee(104,"Nitin","nagapur","8396869558"));
        list.add(new Employee(106,"Deva","Nagar","9883869588"));

        Collections.sort(list,new IdComparator());
        System.out.println(list);

        ArrayList<Employee> list1=new ArrayList<>(list);
        Collections.sort(list1,new NameComparator());

        System.out.println(list1);
    }
}

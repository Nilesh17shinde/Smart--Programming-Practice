package Java8Features.comparableExample;

import java.util.ArrayList;
import java.util.Collections;

public class SortingExample {
    public static void main(String[] args) {
        ArrayList<Employee> list=new ArrayList<>();
        list.add(new Employee(101,"Nilesh Shinde","Pune","8380854583"));
        list.add(new Employee(108,"Nilesh Shinde","Pune","8380844583"));
        list.add(new Employee(102,"Nilesh Shinde","Pune","8380854586"));
        list.add(new Employee(104,"Nilesh Shinde","Pune","8380878983"));

        System.out.println(list);
        System.out.println("After Sort");
        Collections.sort(list);

        System.out.println(list);
    }
}

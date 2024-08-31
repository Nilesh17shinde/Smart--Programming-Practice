package CollectionFramework.Practice.Sort;

import java.util.ArrayList;
import java.util.Collections;

public class SortExample {
    public static void main(String[] args) {
        ArrayList<Emp> emps=new ArrayList<>();
        emps.add(new Emp(11,"Nilesh Shinde","8380854583"));
        emps.add(new Emp(14,"Deva Shinde","8380854585"));
        emps.add(new Emp(10,"Shraddha Shinde","8380854581"));
        emps.add(new Emp(12,"Milind Shinde","8380854580"));
        System.out.println(emps);
        System.out.println("----------------------------------------------------------");
        emps.sort(new IdComparator());

        System.out.println(emps);
        System.out.println("------------------------------------------------Compare to Name------------------------------------------");

         ArrayList<Emp> emps1=new ArrayList<>();
         emps1.add(new Emp(12,"Nilesh Shinde","8380854583"));
         emps1.add(new Emp(1,"Deva Shinde","8380854580"));
         emps1.add(new Emp(15,"Dinesh Shinde","8380854587"));
         emps1.add(new Emp(113,"Abhishek Shinde","8380854587"));

         emps1.sort(new NameComparatoer());
        System.out.println(emps1);
    }
}

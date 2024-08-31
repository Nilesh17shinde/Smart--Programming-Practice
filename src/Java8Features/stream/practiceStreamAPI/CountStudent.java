package Java8Features.stream.practiceStreamAPI;

import java.util.Arrays;
import java.util.List;

public class CountStudent {
    public static void main(String args[]){
        List<Integer> marks= Arrays.asList(35,45,90,40,20,38,34,95,98);
         long totalStudent=marks.stream().count();
        System.out.println("Total Students: "+totalStudent);
        long count = marks.stream().filter(i -> i < 35).count();
        System.out.println("Fail Students: "+count);

        long passStudent=marks.stream().filter(i->i>=35).count();
        System.out.println("Passed Students: "+passStudent);
    }
}

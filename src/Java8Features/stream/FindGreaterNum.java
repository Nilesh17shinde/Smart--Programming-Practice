package Java8Features.stream;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class FindGreaterNum {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(10,2,5,8,18,4,3,9,15,1,6);

        Predicate<Integer> predicate=t-> t>4;

        List<Integer>list1=list.stream()
                .filter(t->t>=4)
                .sorted((a,b)->b-a)
                .collect(Collectors.toList());
        System.out.println(list1);
    }
}

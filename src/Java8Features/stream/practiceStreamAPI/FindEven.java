package Java8Features.stream.practiceStreamAPI;

import java.util.Arrays;
import java.util.List;

public class FindEven {
    public static void main(String args[]){
        List<Integer> list= Arrays.asList(2,5,10,8,19,78,85,19,65,87,100,16,22,22,8,2);
        List<Integer> filterEvenNo = list.stream()
                .filter(i -> i % 2 == 0)
                .map(i->i*2)
                .sorted((a,b)->b-a)
                .distinct()
                .toList();
        System.out.println(filterEvenNo);
    }
}

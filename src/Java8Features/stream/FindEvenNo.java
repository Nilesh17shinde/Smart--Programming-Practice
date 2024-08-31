package Java8Features.stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class FindEvenNo {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(10,2,5,7,9,8,6);

        //List<Integer> evenNum=list.stream()
        // .filter(n->n%2==0)
        // .sorted((a,b)->b-a)
        // .collect(Collectors.toList());
        List<Integer> evenNum=list.stream().filter(n->n%2==0).sorted().collect(Collectors.toList());
        System.out.println(evenNum);
    }
}

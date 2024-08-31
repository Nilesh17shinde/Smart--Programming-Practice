package Java8Features.stream.practiceStreamAPI;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SortElements {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(1,5,7,8,6,4,9);
        List<Integer> customSort=list.stream()
               // .sorted((a,b)->b.compareTo(a))
//                .sorted(Comparator.reverseOrder())
                .sorted((a,b)->b-a)
                .toList();
        System.out.println(customSort);
    }
}

package Java8Features.stream.practiceStreamAPI;

import java.util.Arrays;
import java.util.List;

public class MultiMap {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(1,5,9,8,4,5,6);
        List<Integer> multNo=list.stream().map(i->i*2).distinct().sorted().toList();
        System.out.println(multNo);
    }
}

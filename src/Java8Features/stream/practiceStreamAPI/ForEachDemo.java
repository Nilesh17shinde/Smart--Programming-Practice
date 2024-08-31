package Java8Features.stream.practiceStreamAPI;

import java.util.Arrays;
import java.util.List;

public class ForEachDemo {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(10,20,70,30,50,40,60);
        list.stream().sorted().forEach(System.out::println);
    }
}

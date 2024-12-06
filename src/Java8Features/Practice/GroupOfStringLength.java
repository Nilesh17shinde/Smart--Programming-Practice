package Java8Features.Practice;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupOfStringLength {
    public static void main(String[] args) {
        List<String> input= Arrays.asList("Nilesh","Date","Shinde","Deva","Nilu","Vikas","Ashok");
        final Map<Integer, List<String>> collect = input.stream()
                .collect(Collectors.groupingBy(String::length));
        System.out.println(collect);
    }
}

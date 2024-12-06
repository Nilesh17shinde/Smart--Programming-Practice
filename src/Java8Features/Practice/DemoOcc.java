package Java8Features.Practice;


import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collector;

import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;

public class DemoOcc {
    public static void main(String[] args) {
        String input="NileshShinde";
        Map<String,Long> map= Arrays.stream(input.split(""))
                .collect(groupingBy(Function.identity(),counting()));
        System.out.println(map);
    }


}

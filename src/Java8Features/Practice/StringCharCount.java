package Java8Features.Practice;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;

import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;

// input: Nileshshinde
// output: s=2, d=1, e=2, h=2, i=2, l=1, n=1, N=1
public class StringCharCount {
    public static void main(String[] args) {
        String input="NileshShinde";
        Map<String,Long> map=Arrays.stream(input.split(""))
                .collect(groupingBy(Function.identity(),counting()));
        System.out.println(map);
    }

}

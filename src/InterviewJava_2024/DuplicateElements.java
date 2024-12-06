package InterviewJava_2024;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class DuplicateElements {
    public static void main(String[] args) {
        String str="aaabcdeefghiijklll";
        List<String> map= Arrays.stream(str.split(""))
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
                .entrySet().stream()
                .filter(x->x.getValue()>1)
                .map(Map.Entry::getKey)
                .toList();
        System.out.println(map);
    }
}

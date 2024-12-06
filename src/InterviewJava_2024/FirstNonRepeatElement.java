package InterviewJava_2024;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstNonRepeatElement {
    public static void main(String[] args) {
        String string="naanabccctkdefghhibjklllm";
        final String FirstNonRep = Arrays.stream(string.split(""))
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
                .entrySet().stream()
                .filter(x -> x.getValue() <= 1)
                .findFirst().get().getKey();
        System.out.println(FirstNonRep);
    }
}

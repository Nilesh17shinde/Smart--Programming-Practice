package Java8Features.Practice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveWords {
    public static void main(String[] args) {
        List<String> list= Arrays.asList("Nilesh","Shinde","Deva","Vikas","Gaurav","Ashok","amit");
        String removeSubString="sh";
        final List<String> list1 = list.stream().filter(word -> !word.contains(removeSubString)).toList();
        System.out.println(list1);
        System.out.println("---------------------------------------");

        String joinStrings= list.stream().collect(Collectors.joining(", "));
        System.out.println(joinStrings);
    }
}

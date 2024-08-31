package Java8Features.stream.practiceStreamAPI;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
// Q- Sort the elements based on the length of the ArrayList
public class SortBasedLength {
    public static void main(String[] args) {
        List<String> list= Arrays.asList("AAA","AA","BB","BBBB","AAAAA","CCC","D","DDDDDD");
//        Comparator<String> comparator=(a,b)->{
//            int l1=a.length();
//            int l2=b.length();
//            return Integer.compare(l1,l2);
//        };
List<String>sortLength=list.stream()
        .sorted(Comparator.comparingInt(String::length).reversed())
        .toList();

        System.out.println(sortLength);
    }
}

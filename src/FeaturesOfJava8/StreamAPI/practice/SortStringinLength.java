package FeaturesOfJava8.StreamAPI.practice;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortStringinLength {
    public static void main(String[] args) {
        List<String> list= Arrays.asList("ZA","Nilesh","AAAAAA","BBBBB","Shraddha","CC","D");
// Sort String Length
        List<String>SortusingLength=list.stream().sorted(Comparator.comparingInt(String::length)).collect(Collectors.toList());
        System.out.println(SortusingLength);
//Sort Alphabeticaly
        List<String> sortString=list.stream().sorted(Comparator.reverseOrder()).toList();
        System.out.println(sortString);

//        Sort Number
        List<Integer> list1=Arrays.asList(10,20,30,40,50,80,15,5,99,31);

        List<Integer> sort=list1.stream().sorted((a,b)->Integer.compare(a,b)).toList();
        System.out.println(sort);

//        Max and Min Number
//        it means min= first element in min Stream
//        & max=last element in max Stream

        List<Integer> maxmin=list1.stream().max((a,b)->Integer.compare(b,a)).stream().toList();
        System.out.println(maxmin);

//        Print the Elements

        list.stream().forEach(i-> System.out.println(i));
//        OR
//        list1.forEach(System.out::println);
    }
}

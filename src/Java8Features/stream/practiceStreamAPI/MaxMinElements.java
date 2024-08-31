package Java8Features.stream.practiceStreamAPI;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MaxMinElements {
    public static void main(String[] args) {
        List<String> list= Arrays.asList("AAA","BBBB","AA","BBBBB","C");
        String minString=list.stream()
                .min(Comparator.comparingInt(String::length))
                .get();
        System.out.println("Minimum String is: "+minString);
        System.out.println("-------------------------------------");
        String maxString=list.stream()
                .max(Comparator.comparingInt(String::length))
                .get();
        System.out.println("Maximum String is: "+maxString);
        System.out.println("----------------------------------------------------------------");




        List<Integer>list1=Arrays.asList(12,15,10,5,90,35,8,87,53,54,59,45);

        Integer minNumber=list1.stream().max(Integer::compare).get();
        System.out.println(minNumber);
    }
}

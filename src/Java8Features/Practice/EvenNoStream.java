package Java8Features.Practice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EvenNoStream {
    public static void main(String[] args) {
        List<Integer> list=Arrays.asList(10,5,7,8,9,15,20,9,5,46,20,0,0,27,29,31,464,46,59);
        List<Integer> filterlist=list.stream().filter(x->x%2==0).map(x-> x/2)
                .distinct().sorted((a,b)->b-a)
                .limit(3).skip(1).collect(Collectors.toList());
        System.out.println(filterlist);
        System.out.println("---------------------------------------------------");

        List<Integer> printNo= Stream.iterate(0,x->x+1).limit(101).skip(1).collect(Collectors.toList());
        System.out.println(printNo);

        System.out.println("---------------------------------------------------");
/*
        Integer peek = Stream.iterate(0, x -> x + 1)
                .limit(101).peek(System.out::println)
                .map(x->x/20).distinct().peek(System.out::println).max((a,b)->a-b).get();
        System.out.println(peek);*/

        System.out.println("--------------------------------------------------------");
        Long obj=Stream.iterate(1, x->x+1)
                .limit(50).map(x->x/20).distinct().peek(System.out::println).count();
        System.out.println(obj);




















































































        /*List<Integer> mappedList= filterlist.stream().map(x -> x / 2).collect(Collectors.toList());
        System.out.println(mappedList);
        System.out.println("----------------------------------------------------");*/
    }
}

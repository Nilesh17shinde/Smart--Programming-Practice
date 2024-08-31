package FeaturesOfJava8.StreamAPI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamMain {
    public static void main(String[] args) {
       List<Integer> list= List.of(10,25,14,19,20,30,25,21,22);
       List<Integer> list1=new ArrayList<>();
       list1.add(80);
       list1.add(81);
       list1.add(89);
       list1.add(88);
       list1.add(86);

       List<Integer>list2= Arrays.asList(75,55,95,99,96,93,22,16,18);

        System.out.println(list);
        System.out.println(list1);
        System.out.println(list2);
//        Without Stream()
//        This is a boiler code
        List<Integer>listeven=new ArrayList<>();
        for (Integer i:list2){
            if (i%2==0){
                listeven.add(i);
            }
        }
        System.out.println("even values: "+listeven+" ");
//        Using Stream API
        System.out.println("--------------------------Using Stream API--------------------------------");
        /*Stream<Integer>stream=list2.stream();
        List<Integer>integers=stream.filter(i->i%2==0).collect(Collectors.toList());
        System.out.println(integers);

        Stream<Integer>stream1=list.stream();
        List<Integer>integers1=stream1.filter(i->i>20).collect(Collectors.toList());
        System.out.println(integers1);*/

//        Single Line
        List<Integer>newList=list.stream().filter(i->i<30).collect(Collectors.toList());
        System.out.println(newList);
    }
}

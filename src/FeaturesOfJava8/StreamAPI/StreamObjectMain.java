package FeaturesOfJava8.StreamAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamObjectMain {
    public static void main(String[] args) {
        List<String> list = List.of("Amit", "Aman", "Ali", "Deva", "Nilesh");
        List<String> list1 = list.stream().filter(e -> e.endsWith("a")).collect(Collectors.toList());
        System.out.println(list1);

        List<Integer> number = List.of(10, 25, 17, 12, 20, 2, 4, 9);

        System.out.println("----------------------------Square the numbers--------------------------------");
        List<Integer> getNumber = number.stream().map(i -> i * i).collect(Collectors.toList());
        System.out.println(getNumber);

        System.out.println("------------------------------------Sort the Numbers----------------------------------");
        List<Integer>integers=number.stream().sorted().collect(Collectors.toList());
        System.out.println(integers);

        System.out.println("--------------------Compare to Min----------------------");
        Integer integer=number.stream().min((x,y)-> x.compareTo(y)).get();
        System.out.println(integer);

        System.out.println("--------------------Compare to Max----------------------");
        Integer integer1=number.stream().max((x,y)->x.compareTo(y)).get();
        System.out.println(integer1);

        System.out.println("---------------------Map------------------");
        ArrayList arrayList=new ArrayList();
        arrayList.add("Nilesh");
        arrayList.add("Shraddha");
        arrayList.add("Deva");
        arrayList.add("Gaurav");

        Stream<String> s=arrayList.stream();
        s.map(i->i.toUpperCase()).forEach(i->System.out.println(i));
    }
}

package FeaturesOfJava8.StreamAPI.practice;

import java.util.Arrays;
import java.util.stream.Stream;

public class ArrayInStream {
    public static void main(String[] args) {
        int[] array = {10, 25, 30, 36, 24, 29, 99, 35, 66, 99, 10, 10, 25};

//        Find even numbers in the given array
        Arrays.stream(array).filter(i -> i % 2 == 0).forEach(i -> System.out.print(i + " "));
        System.out.println();
        System.out.println("---------------------------");

//        Sort numbers in ascending order
        Arrays.stream(array).sorted().forEach(i -> System.out.print(i + " "));
        System.out.println("\n---------------------------");

//        Sort number in deasending Order
//        boxed is used to convert int to Integer
        Arrays.stream(array).boxed().sorted((a, b) -> b - a).forEach(i -> System.out.println(i + " "));
//        Remove duplicates in array
        Arrays.stream(array).distinct().forEach(i -> System.out.print(i + " "));
        System.out.println("\n-----------------------------");

//        Add 5 to each sorted element
        Arrays.stream(array).sorted().distinct().map(i -> i + 5).forEach(i -> System.out.print(i + " "));
        System.out.println();
        System.out.println("-------------------------------------");
        //    Stream.Of()

        Stream<?> stream = Stream.of("Nilesh", 10, 25, 30, 40, 60, "Shraddha", "Gaurav");
        stream.map(i->i+":N").forEach(i-> System.out.print(i+" "));
    }
}

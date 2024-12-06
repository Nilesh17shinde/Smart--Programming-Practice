package FeaturesOfJava8.StreamAPI.practice;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class OddEven {
    public static void main(String[] args) {
        List<Integer> no= Arrays.asList(10,30,15,45,90,55,25,28,88,90,12);

        List<Integer> allNo=no.stream()
                .toList();
        System.out.println("Total No: "+allNo);

        Long countNo=no.stream()
                .count();
        System.out.println("Total No of Count: "+countNo);

        List<Integer> evenNo=no.stream()
                .filter(i->i%2==0)
                .toList();
        System.out.println("List of Even No: "+evenNo);

        List<Integer> oddNo=no.stream()
                .filter(i->i%2 !=0)
                .toList();

        System.out.println("List of Odd No: "+oddNo);

        List<Integer> sortAccending=no.stream()
                .sorted()
                .toList();
        System.out.println("After Assending Order: "+sortAccending);

        List<Integer> sortedDeaccending=no.stream()
                .sorted((a,b)->b-a)
                .toList();
        System.out.println("After Dessending Order: "+sortedDeaccending);

        List<Integer> removeDuplicate=no.stream()
                .sorted()
                .distinct()
                .toList();
        System.out.println("After Removing Duplicate Elements: "+removeDuplicate);

        List<Integer> mult=no.stream()
                .map(i->i*2)
                .toList();
        System.out.println("Afetr Mult of 2 : "+mult);

        // add 5 in every odd element

        List<Integer> element=no.stream()
                .filter(i->i%2 !=0)
                .map(i->i+5)
                .map(i->i-2)
                .sorted((a,b)->b-a)
                .toList();
        System.out.println("After Adding 5 In Odd elements: "+ element);

        List<String> name=Arrays.asList("Nilesh","Deva","Shraddha","Shraddha","Abhishek","Pravin","Pratiksha");

        List<String> sort=name.stream()
                .sorted(Comparator.reverseOrder())
                .distinct()
                .collect(Collectors.toList());
        System.out.println("After sort: "+sort);
    }
}

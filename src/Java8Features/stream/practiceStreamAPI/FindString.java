package Java8Features.stream.practiceStreamAPI;

import java.util.Arrays;
import java.util.List;

public class FindString {
    public static void main(String args[]){
        List<String> strings= Arrays.asList("Nilesh","shraddha","Deva","Gaurav","shravani","Sarika");
        List<String> list=strings.stream().filter(i->i.toLowerCase()
                .startsWith("s"))
                .sorted((a,b)->a.compareToIgnoreCase(b))
                .toList();
        System.out.println(list);
    }
}

package Java8Features.stream;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class FindGreaterMethRef {
    public static void main(String[] args) {
        List<Integer>list= Arrays.asList(10,2,5,6,8,1,15,19,38,7);

        Predicate<Integer>predicate=t-> t>4;
        list.stream().filter(t-> t>4).sorted((a,b)->b-a).forEach(FindGreaterMethRef::printElement);
    }
    public static void printElement(int i){
        System.out.print(i+" ");
    }

}

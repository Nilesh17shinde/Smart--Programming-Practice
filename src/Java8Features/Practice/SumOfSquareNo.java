package Java8Features.Practice;

import java.util.Arrays;
import java.util.List;

public class SumOfSquareNo {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(1,2,3,4,5);
        int result=list.stream().mapToInt(i->i*i).sum();
        System.out.println(result);
    }
}

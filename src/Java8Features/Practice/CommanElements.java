package Java8Features.Practice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CommanElements {

    public static void commonElement(int[] array1, int[] array2){
        List<Integer> commenElement= Arrays.stream(array1).filter(number->Arrays.stream(array2).anyMatch(array2Number->array2Number==number)).boxed().collect(Collectors.toList());
        System.out.println("Common elements are: "+commenElement);
    }
    public static void main(String[] args) {
        int array1[]={1,2,3,4,5,6};
        int array2[]={5,6,1,7,8,9,3,10};
        commonElement(array1, array2);
    }
}

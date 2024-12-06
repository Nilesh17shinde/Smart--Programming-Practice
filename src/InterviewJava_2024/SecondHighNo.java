package InterviewJava_2024;

import java.util.Arrays;
import java.util.List;

public class SecondHighNo {
    public static void main(String[] args) {
        int array[]={5,8,9,15,1,20,2,18,19};
        Integer list =Arrays.stream(array)
                .boxed()
                .sorted((a,b)->b-a)
                .skip(1)
                .findFirst()
                .get();
        System.out.println(list);
    }
}

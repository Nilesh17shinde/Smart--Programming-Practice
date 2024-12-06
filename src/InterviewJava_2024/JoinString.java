package InterviewJava_2024;

import java.util.Arrays;
import java.util.List;

public class JoinString {
    public static void main(String[] args) {
        List<String> string= Arrays.asList("1","2","3","4","5");
         String joinResult = String.join("-", string);
        System.out.println(joinResult);
    }
}

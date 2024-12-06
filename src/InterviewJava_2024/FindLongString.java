package InterviewJava_2024;

import java.util.Arrays;

public class FindLongString {
    public static void main(String[] args) {
        String[] strArray={"java","Spring Boot and Rest", "hibernate","Microservices"};
        final String string = Arrays.stream(strArray)
                .reduce((a, b) -> a.length() > b.length() ? a : b)
                .get();
        System.out.println(string);
    }
}

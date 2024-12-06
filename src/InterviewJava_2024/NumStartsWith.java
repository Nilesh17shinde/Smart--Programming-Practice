package InterviewJava_2024;

import java.util.Arrays;

public class NumStartsWith {
    public static void main(String[] args) {
        int[] array={10,5,11,15,20,25,98,99,21,55};

        Arrays.stream(array).boxed()
                .map(i->i+"")
                .filter(i->i.startsWith("1"))
                .forEach(System.out::println);
    }
}

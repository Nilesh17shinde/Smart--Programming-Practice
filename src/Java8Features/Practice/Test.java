package Java8Features.Practice;

import java.util.*;
import java.util.function.Function;

import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;

public class Test {
    public static void main(String[] args) {
        int array[] = {1, 2, 3, 4, 5, 6, 2, 6, 9};
        int target = 8;
        HashMap<Integer, Integer> hashMap = new HashMap<>();

        for (int i = 0; i < array.length; i++) {
            int complement = target - array[i];
            if (hashMap.containsKey(complement)) {
                System.out.println("Pair found " + complement + " , " + array[i]);
            }

            hashMap.put(array[i], i);
        }
    }
}

package Array_Concept.PreMethod;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.stream.IntStream;

public class MergeSortWithDuplicates {
    public static void main(String[] args) {
        int[] a = {20, 90, 20, 90, 100, 30, 100, 60, 50, 40, 70, 80, 10, 10, 30, 100, 90};

        // Sort the array using Java 8 streams
        int[] sortedArray = Arrays.stream(a).sorted().toArray();

        // Use LinkedHashSet to maintain order and detect duplicates
        Set<Integer> set = new LinkedHashSet<>();
        String[] result = IntStream.of(sortedArray)
                .mapToObj(num -> !set.add(num) ? "$" : String.valueOf(num))
                .toArray(String[]::new);

        // Print the modified array
        System.out.println("After: " + String.join(" ", result));
    }
}

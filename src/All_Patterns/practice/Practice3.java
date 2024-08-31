package All_Patterns.practice;

import java.util.Arrays;
import java.util.HashSet;

public class Practice3 {
    public static HashSet<Integer> findMissingNumbers(int[] arr) {
        Arrays.sort(arr); // Sort the array
        HashSet<Integer> missingNumbers = new HashSet<>();
        int n = arr.length + 1; // Including the missing numbers

        HashSet<Integer> set = new HashSet<>();

        // Add all numbers from 1 to n to the HashSet
        for (int i = 1; i <= n; i++) {
            set.add(i);
        }

        // Remove each element from the HashSet
        for (int num : arr) {
            set.remove(num);
        }

        // At this point, the remaining numbers in the HashSet are the missing numbers
        missingNumbers.addAll(set);

        return missingNumbers;
    }

    public static void main(String[] args) {
        int[] arr = {3, 5, 7, 6, 1};
        HashSet<Integer> missingNumbers = findMissingNumbers(arr);
        System.out.println("Missing numbers: " + missingNumbers);
    }
}

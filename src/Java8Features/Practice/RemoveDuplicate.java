package Java8Features.Practice;

import java.util.Arrays;

public class RemoveDuplicate {
//     Remove duplicate elements from an array
    public static void removeDuplicate(int[] arr) {
    int removeDuplicate[] = Arrays.stream(arr).distinct().toArray();
    System.out.println(Arrays.toString(removeDuplicate));
    }

//     Second smallest element
    public static void secondSmallest(int[] arr) {
        int secondSmallest = Arrays.stream(arr).sorted().skip(1).findFirst().orElseThrow(()-> new IllegalArgumentException("Invalid array"));
        System.out.println("Second smallest element is: " + secondSmallest);
    }
    public static void main(String[] args) {
//    int num[] = {1, 2, 3, 4, 5, 6, 7, 8,8,1,2,1,9,9, 9, 10};
        int num[]={2,3,4,5};
    removeDuplicate(num);
    secondSmallest(num);
    }
}

package Array_Concept.PreMethod;

import java.util.Arrays;

public class SortArrayNo {
    public static void main(String[] args) {
        int a[]={10,30,40,50,70,60,9,5};
        Arrays.sort(a);
        System.out.println("After Sort Array is: ");
        for (int i= a.length-1;i>=0;i--){
            System.out.print(a[i]+" ");
        }
    }
}

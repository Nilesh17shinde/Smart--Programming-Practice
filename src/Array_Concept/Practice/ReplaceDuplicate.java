package Array_Concept.Practice;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class ReplaceDuplicate {
    public static void main(String[] args) {
        int[] a = {20, 90, 20, 90, 100, 30, 100, 60, 50, 40, 70, 80, 10, 10, 30, 100, 90};
        Set<Integer> set = new LinkedHashSet<>();

        int min,temp=0;
        for (int i=0;i< a.length;i++){
            min=i;
            for (int j=i+1;j<a.length;j++){
                if (a[j]<a[min]){
                    min=j;
                }
            }
            temp=a[i];
            a[i]=a[min];
            a[min]=temp;
        }
        for (int no:a){
            set.add(no);
        }
        System.out.println("After Sort: ");
        for (int no:set){
            System.out.print(no+" ");
        }
    }
}

package Array_Concept.Practice;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class SelectionSort {
    public static void main(String[] args) {
        int a[]={20,90,20,90,100,30,100,60,50,40,70,80,10,10,30, 100, 90 };
        int min,temp=0;
        for (int i=0;i<a.length;i++){
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
        String[] result=new String[a.length];
        Set<Integer> set = new LinkedHashSet<>();
        for (int i = 0; i < a.length; i++) {
            if (set.contains(a[i])) {
                result[i] = "$";
            } else {
                set.add(a[i]);
                result[i]=String.valueOf(a[i]);
            }
        }

        // Print the modified array
        System.out.print("After: ");
        for (String s : result) {
            System.out.print(s + " ");
        }
    }
}
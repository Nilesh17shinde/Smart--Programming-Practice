package Array_Concept;

import java.util.Arrays;
import java.util.List;

public class ArraySort {
    public static void main(String[] args) {
        int[] array={10,15,20,45,30,87,17,25};
        int min;
        int temp=0;

        for (int i=0;i<array.length;i++){
            min=i;
            for (int j=i+1;j<array.length;j++){
                if (array[j]<array[min]){
                    min=j;
                }
            }
            temp=array[i];
            array[i]=array[min];
            array[min]=temp;
        }
        for (int i=0;i<array.length;i++){
            System.out.print(array[i]+" ");
        }

    List<Integer> list= Arrays.asList(10,15,20,45,30,87,17,25);
        List<Integer> sort=list.stream().sorted((a,b)-> b-a).toList();
        System.out.print(sort+" ");
    }
}

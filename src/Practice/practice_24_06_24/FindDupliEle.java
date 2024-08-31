package Practice.practice_24_06_24;

import java.util.HashSet;
import java.util.Set;

public class FindDupliEle {
    public static void main(String[] args) {
        int[] array={10,15,10,15,16,19,18,25,78,99,99,39,19};

        Set<Integer> uniqueNo=new HashSet<>();
        for (int i=0;i< array.length;i++){
            if (uniqueNo.contains(array[i])){
                System.out.println("Duplicate Numbers: "+array[i]);
            }
            else {
                uniqueNo.add(array[i]);
            }
        }
        System.out.println("Unique No is: "+ uniqueNo);
    }
}

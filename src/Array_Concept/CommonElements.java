package Array_Concept;

import java.util.HashSet;

public class CommonElements {
    public static void main(String[] args) {
        int[] array1={1,2,3,5,6,8,7,9};
        int[] array2={1,2,3,10,11,12,13,3};
        HashSet<Integer> hs=new HashSet<>();
        for (int i=0;i<array1.length;i++){
            for (int j=0;j<array2.length;j++){
                if (array1[i]==array2[j]){
                    hs.add(array1[i]);
                }
            }
        }
        for (int no : hs){
            System.out.print(no+" ");
        }
        //System.out.println(hs);
    }
}

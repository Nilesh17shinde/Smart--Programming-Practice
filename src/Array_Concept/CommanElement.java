package Array_Concept;

import java.util.HashSet;

public class CommanElement {
    public static void main(String[] args) {
        int[] array1={1,2,7,5,8,9,3,6,4};
        int[] array2={1,5,7,8,9,10};

        HashSet<Integer> hs=new HashSet<>();
        for (int k : array1) {
            for (int i : array2) {
                if (k == i) {
                    hs.add(k);
                }
            }
        }
        for (int no:hs){
            System.out.println(no);
        }
    }
}

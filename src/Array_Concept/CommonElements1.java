package Array_Concept;

import java.util.HashSet;

public class CommonElements1 {
    public static void main(String[] args) {
        int[] array1={1,2,3,5,6,8,7,9};
        int[] array2={1,2,3,10,11,12,13,3};

        HashSet<Integer> hs=new HashSet<>();
        HashSet<Integer> hs1=new HashSet<>();
        for (int no: array1){
            hs.add(no);
        }
        for (int no:array2){
            hs1.add(no);
        }
        for (int no:hs){
            boolean b=hs1.add(no);
            if (b==false){
                System.out.print(no+" ");
            }
        }
        System.out.println();
        System.out.print("Common Elements: "+hs1+" ");

    }
}

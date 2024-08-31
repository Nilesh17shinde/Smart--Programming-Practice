package YessInfotech;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
//Unique Pair
* int array[]={2,4,3,2,1,6,5,8,9,7};
        int target=6;
* */
public class Problem1 {
    public static void main(String[] args) {
        int array[]={2,4,3,2,1,6,5,8,9,7};
        for (int i=0;i<array.length;i++){
            if (array[i]+array[i+1]==6){
                    System.out.print("("+array[i]+" ,"+array[i+1]+")");
            }
        }
    }
}

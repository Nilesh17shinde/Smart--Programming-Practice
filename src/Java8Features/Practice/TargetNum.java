package Java8Features.Practice;

import java.util.HashMap;
import java.util.Map;

public class TargetNum {
//    public static void main(String[] args) {
//        int[] num={2,11,15,7,17,19,1};
//        int target=9;
//
//        Map<Integer,Integer> map=new HashMap<>();
//
//        for (int i=0;i<num.length;i++){
//            int complement=target-num[i];
//            if (map.containsKey(complement)){
//                System.out.println("Indexes "+map.get(complement)+" and "+i);
//                return;
//            }
//            map.put(num[i],i);
//        }
//        System.out.println("No Two numbers add upto the targer.");
//    }

        public static void main(String[] args) {
            int[] num = {2, 11, 15, 8, 17, 19, 5};
            int target = 9;
        for (int i=0;i<num.length;i++){
            for (int j=i+1;j<num.length;j++){
                if (num[i]+num[j]==target){
                    System.out.println("Index: "+i+" , "+j);
                    return;
                }
            }
        }
            System.out.println("No target No found");
        }
}

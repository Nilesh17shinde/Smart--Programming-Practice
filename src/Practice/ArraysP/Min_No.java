package Practice.ArraysP;

public class Min_No {
    public static void main(String[] args) {
        int array[]={5,7,8,9,2};
        int min=array[0];
        for (int i=1;i<array.length;i++){
            if (array[i]<min){
                min=array[i];
            }
        }
        System.out.println("Min No is "+min);
    }
}

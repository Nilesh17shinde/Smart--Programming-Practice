package Practice.ArraysP;

public class MaxNo {
    public static void main(String[] args) {
        int a[]={5,8,9,4,5,6,7,10,97,2};
        int max=a[0];
        for (int i=0;i<a.length;i++){
            if (a[i]>max){
                max=a[i];
            }
        }
        System.out.println(max);
    }
}

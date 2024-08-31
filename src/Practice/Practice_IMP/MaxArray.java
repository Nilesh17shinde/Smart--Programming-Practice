package Practice.Practice_IMP;

public class MaxArray {
    public static void main(String[] args) {
        int a[]={10,12,15,45,9,8,78,98,100,105,99};
        int max=a[0];
        for (int i=0;i<a.length;i++){
            if (a[i]>max){
                max=a[i];
            }
        }
        System.out.println(max);
    }
}

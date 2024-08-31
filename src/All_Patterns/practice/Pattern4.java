package All_Patterns.practice;

public class Pattern4 {
    public static void main(String[] args) {
        int arr[]={1,19,36,45,89};
        int arr1=1;
        for (int i=0;i<=arr.length-1;i++){
            arr1=arr[i]*arr[i];
            System.out.print(arr1+" ");
            arr1=1;
        }
    }
}

package All_Patterns.practice;

public class SelectionSort {
    public static void main(String[] args) {
        int arr[]={1,0,1,1,0,0,1,0,1,1,0,0,1};
        int min;
        int temp=0;
        for (int i = 0; i <arr.length ; i++) {
            min=i;
            for (int j = i+1; j <arr.length ; j++) {
                if (arr[j]<arr[min]){
                    min=j;
                }
            }
            temp=arr[i];
            arr[i]=arr[min];
            arr[min]=temp;
        }
        for (int i = 0; i <arr.length ; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}

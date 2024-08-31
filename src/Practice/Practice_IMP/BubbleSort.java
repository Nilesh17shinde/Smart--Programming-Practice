package Practice.Practice_IMP;

public class BubbleSort {
    public static void main(String[] args) {
        int a[]={1,1,0,0,1,1,0,02,5,6,7,8,9,1,1,0,0,0,1,1,0};
        //int temp;
        System.out.println("\"Original Array is: ");
        for (int i=0;i< a.length;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();

        for (int i=0;i<a.length;i++){
            for (int j=0;j<a.length-1;j++){
                if (a[j]<a[j+1]){
                   int temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }

        }
        System.out.println("After Sorting Array Is: ");
        for (int i=0;i< a.length;i++){
            System.out.print(a[i]+" ");
        }
    }
}

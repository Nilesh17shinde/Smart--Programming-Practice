package Array_Concept.Practice;

public class InsertionSort {
    public static void main(String[] args) {
        int array[]={1,5,6,8,2,4,3,7};
        int temp,j;
        for (int i=1;i<array.length;i++){
            temp=array[i];
            j=i;

            while (j>0 && array[j-1]>temp){
                array[j]=array[j-1];
                j--;
            }
            array[j]=temp;
        }
        System.out.println("----------------------------");
        for (int i=0;i<array.length;i++){
            System.out.print(array[i]+" ");
        }
    }
}

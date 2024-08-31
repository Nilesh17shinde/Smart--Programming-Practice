public class TestDemo {
    public static void main(String[] args) {
        int array[]={12,6,9,18,15,12,1,6,3};
        //sort the array and add 0 in duplicate positions
        for(int i=0;i<array.length;i++){
            for(int j=i+1;j<array.length;j++){
                if(array[i]>array[j]){
                    int temp=array[i];
                    array[i]=array[j];
                    array[j]=temp;
                }
                if(array[i]==array[j]){
                    array[j]=0;
                }
            }
        }
        //print sorted array
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]+" ");
        }
    }
}

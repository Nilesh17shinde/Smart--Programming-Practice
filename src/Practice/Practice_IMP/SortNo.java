package Practice.Practice_IMP;

public class SortNo {
    public static void main(String[] args) {
        int a[]={10,20,30,40,90,50,60,80,70};
        int temp;
        for (int i=0;i< a.length;i++){
            for (int j=0;j<a.length-1;j++){
               // if (a[j]>a[j+1]){
                if (a[j]<a[j+1]){
                     temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        }
       /* System.out.println("-----------------------Assending Order------------------------");
        for (int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }*/
        System.out.println("------------------------Desending order--------------------------");
        for (int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
    }
}

public class DemoPr {
    public static void main(String[] args) {
        int arr[][]={{1,2,5,3},
                {1,4,5,8},
                {5,3,6,4},
                {2,4,5,6}};
        int total=0;
        for (int i=0;i< arr.length;i++){
            for (int j=0;j<arr.length;j++){
                System.out.print(arr[i][j]+" ");
               /* if (i==0||j==0||i==3||j==3){
                    total=total+arr[i][j];
                }*/
                if (j-i==0 || j+i==3 ){
                    total=total+arr[i][j];
                }

            }
            System.out.println();
        }
        System.out.println(total);
    }
}

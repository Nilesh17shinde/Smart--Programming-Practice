package ExperianceProg;

public class ZigZagArray {
    public static void main(String[] args) {
        int array[][]={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        int row=4;
        int col=4;

        for (int i = 0; i < row ; i++) {
            if (i%2==0){
                for (int j = 0; j <col ; j++) {
                    System.out.print(array[i][j]+" ");
                }
            }else for (int j = col-1; j >=0 ; j--) {
                System.out.print(array[i][j]+" ");
            }
            System.out.println();
        }
    }
}

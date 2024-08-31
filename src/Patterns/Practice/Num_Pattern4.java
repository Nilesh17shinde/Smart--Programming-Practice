package Patterns.Practice;
/*
5 6 7 8 9
4 5 6 7
3 4 5
2 3
1
* */

/*
1
2 3
3 4 5
4 5 6 7
5 6 7 8 9
* */
public class Num_Pattern4 {
    public static void main(String[] args) {
        int n=5;

        //for (int i=1;i<=n;i++){
        for (int i=n;i>=1;i--){

            for (int j=1;j<=i;j++){
                System.out.print(i+j-1+" ");
            }
            System.out.println();
        }
    }
}

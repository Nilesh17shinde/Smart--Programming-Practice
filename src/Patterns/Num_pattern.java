package Patterns;
/*
1
2 3
3 4 5
4 5 6 7
5 6 7 8 9
 */
public class Num_pattern {
    public static void main(String[] args) {
        int n=5;
        for (int i=1;i<=n;i++){
            for (int j=1;j<=i;j++){
                System.out.print(i+j-1+" ");
            }
            System.out.println();
        }
    }
}

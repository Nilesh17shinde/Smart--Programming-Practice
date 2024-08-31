package All_Patterns;
/*
55555
 4444
  333
   22
    1
* */
public class Pattern16 {
    public static void main(String[] args) {
        int n=5;
        for (int i=1;i<=n;i++){
            for (int k=n-1;k>=i;k--) {
                System.out.print(" ");
            }
            for (int j=i;j>=1;j--){
                System.out.print(j);
            }
            System.out.println();
        }
    }

}

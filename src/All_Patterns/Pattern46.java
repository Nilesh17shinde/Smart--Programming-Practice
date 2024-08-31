package All_Patterns;
/*
     5
    5 4
   5 4 3
  5 4 3 2
 5 4 3 2 1


* */
public class Pattern46 {
    public static void main(String[] args) {
        int n=5;
        for (int i=n;i>=1;i--){
            for (int k=i;k>=1;k--){
                System.out.print(" ");
            }
            for (int j=n;j>=i;j--){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}

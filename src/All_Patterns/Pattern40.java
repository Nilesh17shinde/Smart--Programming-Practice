package All_Patterns;
/*
5 4 3 2 1
5 4 3 2
5 4 3
5 4
5
* */
public class Pattern40 {
    public static void main(String[] args) {
        int n=5;
        for (int i=1;i<=n;i++){
            for (int k=n;k>=i;k--){
                System.out.print(k+" ");
            }
            System.out.println();
        }
    }
}

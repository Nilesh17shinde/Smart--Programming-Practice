package All_Patterns;
/*
1
2 1
3 2 1
4 3 2 1
5 4 3 2 1
5 4 3 2 1
4 3 2 1
3 2 1
2 1
1

* */
public class Pattern51 {
    public static void main(String[] args) {
        int n=5;
        for (int i=1;i<=n;i++){
            for (int k=i;k>=1;k--){
                System.out.print(k+" ");
            }
            System.out.println();
        }
        for (int i=n;i>=1;i--){
            for (int k=i;k>=1;k--){
                System.out.print(k+" ");
            }
            System.out.println();
        }
    }
}

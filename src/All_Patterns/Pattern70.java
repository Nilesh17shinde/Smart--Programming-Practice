package All_Patterns;
/*
E D C B A
E D C B A
E D C B A
E D C B A
E D C B A
* */
public class Pattern70 {
    public static void main(String[] args) {
        int n=5;
        for (int i=1;i<=n;i++){
            char ch='E';
            for (int j=1;j<=n;j++){
                System.out.print(ch+" ");
                ch--;
            }
            System.out.println();
        }
    }
}

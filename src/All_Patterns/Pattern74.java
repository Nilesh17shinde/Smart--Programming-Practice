package All_Patterns;
/*
E
E D
E D C
E D C B
E D C B A
* */
public class Pattern74 {
    public static void main(String[] args) {
        int n=5;
        for (int i=1;i<=n;i++){
            char ch='E';
            for (int j=1;j<=i;j++){
                System.out.print(ch+" ");
                ch--;
            }
            System.out.println();
        }
    }
}

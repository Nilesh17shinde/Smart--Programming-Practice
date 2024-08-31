package All_Patterns;
/*
E D C B A
E D C B
E D C
E D
E

* */
public class Pattern73 {
    public static void main(String[] args) {
        int n=5;
        for (int i=n;i>=1;i--){
            char ch='E';
            for (int j=1;j<=i;j++){
                System.out.print(ch+" ");
                ch--;
            }
            System.out.println();
        }
    }
}

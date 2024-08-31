package All_Patterns;
/*
A
B A
C B A
D C B A
E D C B A

* */
public class Pattern76 {
    public static void main(String[] args) {
        int n=5;
        for (int i=0;i<n;i++){
            char ch=(char)('A'+i);
            for (int j=0;j<=i;j++){
                System.out.print(ch+" ");
                ch--;
            }
            System.out.println();
        }
    }
}

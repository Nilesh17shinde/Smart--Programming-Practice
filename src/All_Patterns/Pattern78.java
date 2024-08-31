package All_Patterns;
/*\
E D C B A
D C B A
C B A
B A
A
* */
public class Pattern78 {
    public static void main(String[] args) {
        int n=5;
        for (int i=0;i<n;i++){
            char ch=(char)('E'-i);
            for (int j=1;j<=n-i;j++){
                System.out.print(ch+" ");
                ch--;
            }
            System.out.println();
        }
    }
}

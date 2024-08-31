package All_Patterns;
/*
A B C D E
B C D E
C D E
D E
E

* */
public class Pattern77 {
    public static void main(String[] args) {
        int n=5;
                for (int i=0;i<n;i++){
                    char ch=(char)('A'+i);
                    for (int j=1;j<=n-i;j++){
                        System.out.print(ch+" ");
                        ch++;
                    }
                    System.out.println();
                }
            }
        }

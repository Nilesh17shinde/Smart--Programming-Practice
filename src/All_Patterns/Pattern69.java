package All_Patterns;
/*
A B C D E
A B C D E
A B C D E
A B C D E
A B C D E
* */
public class Pattern69 {
    public static void main(String[] args) {
        int n=5;

        for (int i=1;i<=n;i++){
            char ch='A';
            for (int j=1;j<=n;j++){
                System.out.print(ch+" ");
                ch++;
            }
            System.out.println();
        }
    }
}
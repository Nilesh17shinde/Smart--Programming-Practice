package Practice.Practice_IMP;

public class Char_Pattern {
    public static void main(String[] args) {
        int n = 5;
        char ch = 'a';
        for (int i=1;i<=n;i++){
            /*for (int k=n;k>i;k--){
                System.out.print(" ");
            }*/
            for (int j=1;j<=i;j++){
                System.out.print(ch+" ");
                ch++;
            }
            System.out.println();
        }
    }
}

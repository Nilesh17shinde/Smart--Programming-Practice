package All_Patterns.practice.otherWays;

public class Patterns {
    public static void main(String[] args) {
    pattern5(4);
    }

    static void pattern5(int n){
        int originalN=n;
        n=2*n;
        for (int i = 0; i <=n ; i++) {
            for (int j = 0; j <=n ; j++) {
                int atEveryIndex=originalN-Math.min(Math.min(i,j),Math.min(n-i,n-j));
                System.out.print(atEveryIndex+" ");
            }
            System.out.println();
        }
    }static void pattern4(int n){
        n=2*n;
        for (int i = 0; i <=n ; i++) {
            for (int j = 0; j <=n ; j++) {
                int atEveryIndex=Math.min(Math.min(i,j),Math.min(n-i,n-j));
                System.out.print(atEveryIndex+" ");
            }
            System.out.println();
        }
    }
    static void pattern3(int n){
        for (int i = 1; i <=2*n ; i++) {
        int c=i>n ? 2*n -i: i;
            for (int j = 1; j <=n-c ; j++) {
                System.out.print("  ");
            }
            for (int j = c; j >=1 ; j--) {
                System.out.print(j+" ");
            }
            for (int j = 2; j <=c ; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }

    }
    public static void pattern2(int n){
        for (int i = 1; i <=2*n ; i++) {
        int totalcolinrow=i>n ? 2*n-i:i;

        int space=n-totalcolinrow;
        for (int s=1;s<=space;s++){
            System.out.print(" ");
        }
            for (int j = 1; j <=totalcolinrow ; j++) {

                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void pattern1(int n){
        for (int i = 1; i <=2*n ; i++) {
            int totalcolinrow=i>n ? 2*n-i:i;
            for (int j = 1; j <=totalcolinrow ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

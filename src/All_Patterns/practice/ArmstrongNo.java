package All_Patterns.practice;
//Its work only 3 digit no
public class ArmstrongNo {
    public static void main(String[] args) {
        int a,b,c;
        int n=370;
        a=n%10;
        int y=n/10;
        b=y%10;
        c=y/10;
        int d=(a*a*a)+(b*b*b)+(c*c*c);
        if (d==n){
            System.out.println("armstrong No");
        }else {
            System.out.println("Not armstrong");
        }
    }
}

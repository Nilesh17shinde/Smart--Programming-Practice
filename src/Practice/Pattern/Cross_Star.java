package Practice.Pattern;

public class Cross_Star {
    public static void main(String[] args) {
        int n=4;
        //for (int i=1;i<=n;i++){
        for (int i=n;i>=1;i--){
            for (int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            System.out.println("*");
        }
    }
}

package Practice.Pattern;

public class Pyramid_Mix {
    public static void main(String[] args) {
        int n=3;
        for (int i=1;i<=n;i++){
            for (int j=1;j<=i+2 ;j++){
                if (j<=(n-i)){
                    System.out.print(" ");
                }
                else if (j==n){
                    System.out.print(i);
                }else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}

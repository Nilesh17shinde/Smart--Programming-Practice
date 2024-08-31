package Patterns;

public class StarP_6 {
    public static void main(String[] args) {
        int n=5;
        for (int i=0;i<n;i++){
            for (int k=0;k<n;k++){
                if (i==k || i+k==n-1){
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}

package Practice_16_05;

public class Prime_N_No {
    public static void main(String[] args) {
        int n=10;
        int temp=0;
        for (int i=0;i<=n;i++){
            for (int j=2;j<=i-1;j++){
                if (i%j==0){
                    temp++;
                }
            }
            if (temp==0){
                System.out.println(i);
            }else {
                temp=0;
            }
        }
    }
}

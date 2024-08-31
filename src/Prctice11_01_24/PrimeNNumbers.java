package Prctice11_01_24;

public class PrimeNNumbers {
    public static void main(String[] args) {
        int n=102 ;
        int temp=0;
        for (int k=1;k<=n;k++) {
            for (int i = 2; i < k; i++) {
                if (k % i == 0) {
                    temp++;
                }
            }

            if (temp == 0) {
                System.out.print(k + " ");
            }
            else {
                temp=0;
            }
        }
    }
}

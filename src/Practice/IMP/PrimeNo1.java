package Practice.IMP;

public class PrimeNo1 {
    public static void main(String[] args) {
        int n=100;
        int temp=0;
        for (int k=1;k<=n;k++) {
            for (int i = 2; i < k; i++) {
                if (k % i == 0) {
                    temp = temp + 1;
                }
            }
            if (temp == 0) {
                System.out.print(k+" ");
            } else {
                temp=0;
            }
        }
    }
}

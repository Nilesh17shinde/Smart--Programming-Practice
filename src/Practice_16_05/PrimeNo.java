package Practice_16_05;

public class PrimeNo {
    public static void main(String[] args) {
        int n=7;
        int temp=0;
        for (int i=2;i<n;i++){
            if (n%i==0){
               temp++;
            }
        }
        if (temp==0){
            System.out.println("No is Prime");
        }else {
            System.out.println("No is Not prime");
        }
    }
}

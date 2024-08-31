package Prctice11_01_24;

public class PrimeNo {
    public static void main(String[] args) {
        int n=9;
        int temp=0;
        for (int i=2;i<n;i++){
            if (n%i==0){
               temp++;
            }
        }
        if (temp==0){
            System.out.print(n+" is prime");
        }else {
            System.out.print(n+" is not prime");
        }
    }
}

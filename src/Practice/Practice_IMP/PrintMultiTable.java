package Practice.Practice_IMP;

import java.util.Scanner;

public class PrintMultiTable {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any No: ");
        int n=sc.nextInt();
        int mult=1;
        for (int i=1;i<=10;i++){
          mult= i*n;
            System.out.println(i+" * "+n+" = "+ mult);
        }

    }
}

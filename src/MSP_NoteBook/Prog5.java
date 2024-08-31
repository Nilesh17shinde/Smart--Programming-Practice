package MSP_NoteBook;

import java.util.Scanner;

//ReverseNo
public class Prog5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter No u want to reverse: ");
        int n=sc.nextInt();

        int rev=0;
        int rem;

        while (n>0){
            rem=n%10;
            rev=rev*10+rem;
            n=n/10;
        }
        System.out.println("After reverse No is: " +rev);
    }
}

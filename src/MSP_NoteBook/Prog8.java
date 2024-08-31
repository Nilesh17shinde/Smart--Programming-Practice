package MSP_NoteBook;

import java.util.Scanner;
//Prime No
public class Prog8 {
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
        System.out.println("Enter Any No u want to check: ");
        int n= sc.nextInt();
        int temp=0;
        for (int i=2;i<n;i++){
            if (n%i==0){
                temp++;
            }
        }
        if (temp==0){
            System.out.println(n+" no is Prime");
        }else {
            System.out.println(n+" no is Not Prime");
        }
    }
}

package MSP_NoteBook;

import java.util.Scanner;

//Prime N no
public class Prog9 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Any No u want to check: ");
        int n= sc.nextInt();
        int temp=0;
        for (int j=1;j<=n;j++) {
            for (int i = 2; i < j; i++) {
                if (j % i == 0) {
                    temp++;
                }
            }
            if (temp==0){
                System.out.print(j+" ");
            }else {
                temp=0;
            }
        }

    }
}

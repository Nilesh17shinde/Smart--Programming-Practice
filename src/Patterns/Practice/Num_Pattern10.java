package Patterns.Practice;

public class Num_Pattern10 {
        public static void main(String[] args) {
            int n = 5; // Number of rows

            for (int i = 0; i < n; i++) {
                int num = 1;
                for (int j=n;j>=i+1;j--){
                    System.out.print(" ");
                }
                // Calculate the numbers for each row
                for (int j = 0; j <= i; j++) {
                    System.out.print(num + " ");
                    num = num * (i - j) / (j + 1);
                }

                System.out.println(); // Move to the next line
            }

            for (int i = n - 2; i >= 0; i--) {
                int num = 1;
                for (int j=n;j>=i+1;j--){
                    System.out.print(" ");
                }
                // Calculate the numbers for each row
                for (int j = 0; j <= i; j++) {
                    System.out.print(num + " ");
                    num = num * (i - j) / (j + 1);
                }

                System.out.println(); // Move to the next line
            }
        }


}

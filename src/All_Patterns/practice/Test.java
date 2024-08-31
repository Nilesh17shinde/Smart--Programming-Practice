package All_Patterns.practice;

public class Test {

    /*
7 8 9 1 2 3 4 5
8 9 1 2 3 4 5
9 1 2 3 4 5
1 2 3 4 5
2 3 4 5
3 4 5
4 5
5
    * */
    /*public static void main(String[] args) {
        int rows=8;
        for(int i=0;i<rows;i++){
            int num=i+6;
            for(int j=0;j<rows-i;j++){
                num=num%9+1;
                System.out.print(num+" ");

            }
            System.out.println();
        }
    }*/

   /* public static void main(String[] args) {

        String str = "nitin";

        if (isPalindrome (str))

            System.out.println(str +" is a palindrome.");

        else
            System.out.println(str+" not");

    }

    public static boolean isPalindrome (String str) {

        int left = 0;

        int right = str.length() -1;

        while (left < right) {

            if (str.charAt(left) != str.charAt(right)) {

                return false;

            }

            left++;

            right--;

        }

        return true;

    }*/

    /*public static void main(String[] args) {
        int rows=5;
        for (int i=0;i<rows;i++){
            for (int j=0;j<rows;j++){
                if (j<i){
                    System.out.print(" ");
                }else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }*/
    public static void main(String[] args) {
        int rows=6;
        for (int i = 1; i <=rows ; i++) {
            for (int j = 1; j <=rows ; j++) {
                if (j==1 || j==rows ){
                    System.out.print("* ");
                }else {
                    System.out.print((i+j+3)+" ");
                }
            }
            System.out.println();
        }
    }
}

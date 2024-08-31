package All_Patterns;
/*
 *
 * ** *** **** ***** ****** ******* ******** ********* **********
 * ** *** **** *****
 * ** *** **** ***** ******
 * **

 * */
public class Pattern84 {
    public static void main(String[] args) {
        int[]stars={1,10,5,6,2};
        int length= stars.length;
        for (int i=0;i<length;i++){
            for (int j=1;j<=stars[i];j++){
                for (int k=0;k<j;k++){
                    System.out.print("*");
                }
                System.out.print(" ");
            }
            System.out.println();
        }

    }
}

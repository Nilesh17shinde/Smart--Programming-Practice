package Array_Concept.Practice;

public class Demo1 {
    public static void main(String[] args) {
        /*int[][] a={{1,2,3},{1,2,3,4,5,6,7,8,9},{1,2,3,4,5},{1,2,3,4,5,6,7}};

        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
                System.out.print("*");
            }
            System.out.println();
        }*/

        /*
        ***
        *** **** *****
        *** **** ***** ******
        *** **** ***** ****** ******* ******** ********* *********
        *** **** ***** ****** *******
        * */
        //how i solve it
        int n=5;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}

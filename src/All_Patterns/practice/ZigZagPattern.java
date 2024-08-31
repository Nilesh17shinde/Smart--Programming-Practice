package All_Patterns.practice;

public class ZigZagPattern {
    public static void main(String[] args) {
        int n=5;
        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=i+1 ; j++) {
                int x=0;
                for (int k = 1; k<=j ; k++) {
                    x=x+n-k;
                    if (j%2==0){
                        System.out.print(x+i-j+1+" ");
                    }else {
                        System.out.print(x+n-i+" ");
                    }
                }
            }
            System.out.println();
        }
    }
}

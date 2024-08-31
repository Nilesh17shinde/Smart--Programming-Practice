package Practice.Practice_IMP;

public class NPrime {
    public static void main(String[] args) {
        int n=100;
        int temp=0;
        for (int i=1;i<=n;i++){
            for (int j=2;j<i;j++){
                if (i%j==0){
                    temp++;
                }
            }
            if (temp==0){
                System.out.print(i+" ");
            }else {
                temp=0;
            }
        }
    }
}

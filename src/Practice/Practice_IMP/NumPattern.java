package Practice.Practice_IMP;

public class NumPattern {
    public static void main(String[] args) {
        int n=5;
        //for (int i=1;i<=n;i++){
        for (int i=n;i>=1;i--){
            for (int j=i;j<=n;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}

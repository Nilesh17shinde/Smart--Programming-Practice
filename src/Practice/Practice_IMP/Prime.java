package Practice.Practice_IMP;

public class Prime {
    public static void main(String[] args) {
        int n=17;
        int temp=0;
        for (int i=2;i<n;i++){
            if (n%i==0){
                temp++;
            }
        }
        if (temp==0){
            System.out.println("Prime");
        }else {
            System.out.println("Not Prime");
        }
    }
}

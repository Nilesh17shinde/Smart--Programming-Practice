package Practice_16_05;

public class FactNo2 {
    public static void main(String[] args) {
        int no=5;
        int fact=1;
        for (int i=1;i<=no;i++){
           fact=fact*i;
            System.out.print(fact+" ");
        }
        System.out.println("----------------------------------------------");
        System.out.println(fact);
    }
}

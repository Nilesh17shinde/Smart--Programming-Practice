package Practice.IMP;

public class FactNo {
    public static void main(String[] args) {
        int n=5;
        int fact=1;
        for (int i=1;i<=n;i++){
            fact=fact*i;
        }
        System.out.println("factorial of "+n+" is "+fact);
    }
}
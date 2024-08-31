package Practice.Practice_IMP;

public class SwapNo {
    public static void main(String[] args) {
        int no1=102;
        int no2=405;
//        int temp=no1;
//        no1=no2;
//        no2=temp;
        no1=no1+no2;//102+405=507
        no2=no1-no2; //507-405=102
        no1=no1-no2;//507-102=405
        System.out.println(no1);
        System.out.println(no2);
    }
}

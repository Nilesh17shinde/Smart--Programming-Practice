package Practice_16_05;
//5!=5*4*3*2*1
public class FactorialNo {
    static  int fact=1;
    void calfact(int no){

        if (no>=1){
            fact=fact*no;
            calfact(no-1);
        }

    }
    public static void main(String[] args) {
        FactorialNo obj=new FactorialNo();
        int no=5;
        obj.calfact(no);
        System.out.println(fact);
    }
}

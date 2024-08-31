package Practice.Practice_03_07_24;
//Method Overloading
public class Vehical {
void v1(int no,int no1, int c){
    c=no+no1;
    System.out.println("method 1");
    System.out.println(c);
}
void v1(String no,int n){
    System.out.println("v2 Method");
}

    public static void main(String[] args) {
        Vehical obj=new Vehical();
        obj.v1(1,1,1);
        obj.v1("12",1);
    }
}

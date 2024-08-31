package Practice.Practice_03_07_24;
//Method Overriding

class Parent{
    void v1(int no,int no1, int c){
        System.out.println("method 1");
    }
    void v1(String no,int n){
        System.out.println("v2 Method");
    }
}
class Child extends Parent{
    void v1(int no,int no1, int c){
        System.out.println("method 1");

    }
}
public class OverridingTest {
    public static void main(String[] args) {
        Child obj=new Child();
    }
}

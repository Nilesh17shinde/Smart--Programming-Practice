package OOPS_Concept.Polymorphism_P;

public class DemoOverriding {

    public static  void add(int a, int b){
        System.out.println("Sum is:: "+(a+b));
    }

    public static  void add(Integer a, Integer b){
        System.out.println("Sum is: "+(a+b));
    }
    public static void main(String[] args) {
        DemoOverriding obj = new DemoOverriding();
        obj.add(10,20);
        obj.add(Integer.valueOf(40),Integer.valueOf(20));
    }
}

package Java8Features.LambdaExpression;

public class MainInter{
    public static void main(String[] args) {
        MyInter obj=()->{
            System.out.println("This is a first time i am using lambda expression");
        };
        obj.sayHello();

        MyInter obj1=()-> System.out.println("This is a second time i am using lambda expression");
        obj1.sayHello();

        SumInter sumInter=(int a,int b)->{
            return a+b;
        };
        System.out.println("sum is "+sumInter.sum(10,20));

        SumInter sumInter1=( a, b)-> {
            return a+b;
        };
        System.out.println("sum is "+sumInter1.sum(100,20));
    }
}

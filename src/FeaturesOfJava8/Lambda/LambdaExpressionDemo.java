package FeaturesOfJava8.Lambda;
interface Demo{
    String getName();
}
public class LambdaExpressionDemo {
    public static void main(String[] args) {
    Demo demo=()->"Nilesh Shinde";
        System.out.println(demo.getName());
        Demo add=()->"pune";
        System.out.println(add.getName());
    }
}

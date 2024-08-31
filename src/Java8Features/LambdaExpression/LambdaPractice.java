package Java8Features.LambdaExpression;

import java.util.function.Function;

@FunctionalInterface
interface MyTest{
    String test(String s1,String s2);
}
public class LambdaPractice {
    public static void main(String[] args) {
        MyTest myTest=(s1, s2) -> s1+":"+s2;
        System.out.println(myTest.test("Nilesh","Java Developer"));

        System.out.println("-----------------------------------------");

        Function<Integer,String> function=(t)->"Output: " +t;
        System.out.println(function.apply(95));
    }
}

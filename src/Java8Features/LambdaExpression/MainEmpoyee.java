package Java8Features.LambdaExpression;

public class MainEmpoyee {
    public static void main(String[] args) {
        Employee emp=()->"KHARADI PUNE";
        System.out.println(emp.address());
        Employee emp1=()-> "Ahmednagar";
        System.out.println(emp1.address());
    }
}

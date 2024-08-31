package OOPS_Concept.Constructer_P;
//parameterised Constructer
public class Employee {
    int emp_id;
    String emp_name;
    String emp_address;

    public Employee(int emp_id, String emp_name, String emp_address) {
        this.emp_id = emp_id;
        this.emp_name = emp_name;
        this.emp_address = emp_address;

    }
    void display(){
        System.out.println("Emp_id: "+emp_id);
        System.out.println("Emp_name: "+emp_name);
        System.out.println("Emp_address: "+emp_address);
    }

    public static void main(String[] args) {
        Employee employee=new Employee(101,"Nilesh Shinde","Pune 411027");
        employee.display();
    }
}

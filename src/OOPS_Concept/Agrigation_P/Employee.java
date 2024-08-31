package OOPS_Concept.Agrigation_P;

public class Employee {
    int id;
    String name;
    Address address;

     Employee(int id, String name, Address address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }
    void display(){
        System.out.println("Employee id: "+id );
        System.out.println("Employee name: "+name);
        System.out.println("Employee address: "+address.city+","+address.state+","+address.country);
    }

    public static void main(String[] args) {
        Address obj=new Address("Pune","MH","India");
        Employee obj1=new Employee(101,"Nilesh Shinde",obj);
        obj1.display();
    }
}

package OOPS_Concept.Encapsulation_P;

public class Student {
    private int age;
    private String name;
    private String address;

    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age=age;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public String getAddress(){
        return address;
    }
    public void setAddress(String address){
        this.address=address;
    }
    public void display(){
        System.out.println("Student Details");
        System.out.println("age: "+age);
        System.out.println("name: "+name);
        System.out.println("address: "+address);
    }

    public static void main(String[] args) {
        Student obj=new Student();
        obj.setAge(25);
        obj.setName("Nilesh");
        obj.setAddress("Pune");
        obj.display();
    }
}

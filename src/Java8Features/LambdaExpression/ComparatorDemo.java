package Java8Features.LambdaExpression;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Student{
    int id;
    String name;
    String address;
    String mobNum;

    public Student(int id, String name, String address, String mobNum) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.mobNum = mobNum;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", mobNum=" + mobNum +
                '}';
    }
}
public class ComparatorDemo {
    public static void main(String[] args) {
        Student s=new Student(19,"Nilesh Shinde","Pune","9890308080");
        Student s1=new Student(3,"Nilesh Shinde","Pune","8380854583");
        Student s2=new Student(1,"Nilesh Shinde","Pune","9890308887");
        Student s3=new Student(5,"Nilesh Shinde","Pune","9890309885");
        Student s4=new Student(7,"Nilesh Shinde","Pune","9890308083");
        Student s5=new Student(15,"Nilesh Shinde","Pune","9890388089");
        List<Student> list=new ArrayList<>();
        list.add(s);
        list.add(s1);
        list.add(s2);
        list.add(s3);
        list.add(s4);
        list.add(s5);
        Collections.sort(list,(a,b)->a.id -b.id);
        System.out.println(list);
    }
}

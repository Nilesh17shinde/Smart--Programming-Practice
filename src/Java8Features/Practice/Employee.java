package Java8Features.Practice;

public class Employee {
    private int id;
    private String name;
    private String location;
    private int salary;  // Changed from String to int
    private String dept;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public Employee(int id, String name, String location, int salary, String dept) {
        this.id = id;
        this.name = name;
        this.location = location;
        this.salary = salary;
        this.dept = dept;
    }
    Employee(){
        super();
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", location='" + location + '\'' +
                ", salary=" + salary +
                ", dept='" + dept + '\'' +
                '}';
    }
}

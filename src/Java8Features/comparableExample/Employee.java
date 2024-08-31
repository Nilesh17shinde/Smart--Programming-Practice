package Java8Features.comparableExample;

public class Employee implements Comparable<Employee> {
    private int id;
    private String name;
    private String city;
    private String mobNo;

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

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getMobNo() {
        return mobNo;
    }

    public void setMobNo(String mobNo) {
        this.mobNo = mobNo;
    }

    public Employee(int id, String name, String city, String mobNo) {
        this.id = id;
        this.name = name;
        this.city = city;
        this.mobNo = mobNo;
    }
    public Employee(){
        super();
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", city='" + city + '\'' +
                ", mobNo=" + mobNo +
                '}';
    }

    @Override
    public int compareTo(Employee o) {
        return this.name.compareTo(o.name);
    }
}

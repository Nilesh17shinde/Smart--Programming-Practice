package Constructor;

public class DemoPara {
    int id;
    int age;
    String name;

    public DemoPara(int id, int age, String name){
        this.id=id;
        this.age=age;
        this.name=name;
    }
    public void display(){
        System.out.println("Student Details");
        System.out.println("id: "+id);
        System.out.println("age: "+age);
        System.out.println("name: "+name);
    }

    public static void main(String[] args) {
        DemoPara obj = new DemoPara(1, 20, "John");
        obj.display();
    }
}

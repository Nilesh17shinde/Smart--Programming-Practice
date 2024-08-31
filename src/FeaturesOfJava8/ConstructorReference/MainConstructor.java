package FeaturesOfJava8.ConstructorReference;

public class MainConstructor {
    public static void main(String[] args) {
//        Provider provider= () -> new Student();
        Provider provider= Student::new;
        Student student=provider.getStudent();
        student.display();
    }
}

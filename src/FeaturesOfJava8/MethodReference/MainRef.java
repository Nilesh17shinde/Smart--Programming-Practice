package FeaturesOfJava8.MethodReference;

public class MainRef {
    public static void main(String[] args) {
        System.out.println("Learning Main Method..");
// Static Method Refer
        InterMeth interMeth=Stuff::doStuf;
        interMeth.doStuff();
    }
}

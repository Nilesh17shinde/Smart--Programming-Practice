package FeaturesOfJava8;
@FunctionalInterface
public interface FunctionalInterfaceDemo {
    //It can have only single abstract methods. and multiple default and static Methods
    public void demo();
    static void task(){

    };
    default void abc(){

    };

}

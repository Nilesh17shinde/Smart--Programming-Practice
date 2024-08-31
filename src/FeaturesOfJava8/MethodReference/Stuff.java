package FeaturesOfJava8.MethodReference;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Stuff {
    public static void doStuf(){
        System.out.println("I am doing task");
        LocalDate date=LocalDate.now();
        LocalDateTime time=LocalDateTime.now();
        System.out.println(date.toString());
        System.out.println(time.toString());
    }
}

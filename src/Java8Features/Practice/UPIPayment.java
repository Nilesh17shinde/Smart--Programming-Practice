package Java8Features.Practice;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

@FunctionalInterface
public interface UPIPayment  {
    String doPayment(String source, String dest);

    default double getScratchCard() {
        double scratchCardValue = new Random().nextDouble();
        System.out.println("Scratch card value: " + scratchCardValue);
        return scratchCardValue;
    }

    static String datePatterns(String pattern) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
        return simpleDateFormat.format(new Date());
    }
}

package Java8Features.Practice;
import java.util.*;

class Difference {
    String s;
    public void calcFlips() {
        int count0 = 0;
        int count1 = 0;

        for (char ch : s.toCharArray()) {
            if (ch == '0') {
                count0++;
            } else {
                count1++;
            }
        }

        // Calculate flips needed to make count of '0's and '1's equal
        int flips = Math.abs(count0 - count1) / 2;
        System.out.println(flips);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String x = sc.next();
        Difference diff = new Difference();
        diff.s = x;

        diff.calcFlips();
    }
}

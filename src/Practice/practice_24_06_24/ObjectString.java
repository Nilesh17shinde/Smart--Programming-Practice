package Practice.practice_24_06_24;

public class ObjectString {
    public static void main(String[] args) {
        // Array containing the elements of the set
        Object[] elements = {10254, "dfr04", 14550,11, 1035, "asd0h", 102};

        int sum = 0;

        for (Object element : elements) {
            if (element instanceof Integer) {
                int number = (Integer) element;
                if (Integer.toString(number).contains("0")) {
                    sum += number;
                }
            }
        }
        System.out.println(" The number of integer which contains 0 is "+sum);
    }
}

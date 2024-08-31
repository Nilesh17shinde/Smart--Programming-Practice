package Practice;
public class Test1 {

    public static void main(String[] args) {

        short discountPercentage = 7;

        int noofItems = 10;

        float pricePerItem = 255.6f;

        float taxAmount = 135.50f;

        int discountedAmount = (noofItems * (int) pricePerItem) * (1 - discountPercentage / 100);

        double totalAmount = discountedAmount + taxAmount;

        System.out.println("Total amount to be paid is " + totalAmount);
    }
}
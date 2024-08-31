package Java8Features.Practice;

public class AmazonePay implements UPIPayment {
    public static void main(String[] args) {
        AmazonePay pay = new AmazonePay();
        pay.getScratchCard();
        String txDate = pay.doPayment("UPI", "XYZ");
        System.out.println("Transaction Date: " + txDate);
    }

    @Override
    public String doPayment(String source, String dest) {
        String txDate = UPIPayment.datePatterns("dd-mm-yyyy");
        System.out.println("Payment from " + source + " to " + dest + " on " + txDate);
        return txDate;
    }

    @Override
    public double getScratchCard() {
        return UPIPayment.super.getScratchCard();
    }
}

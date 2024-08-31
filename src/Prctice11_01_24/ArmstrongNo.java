package Prctice11_01_24;

public class ArmstrongNo {
    public static void main(String[] args) {
        int no=153;
        int temp=no;
        int length=0;
        while (temp!=0){
            length++;
            temp=temp/10;
        }
        int tempo=no;
        int rem;
        int arm=0;
        while (tempo!=0){
            int mult=1;
            rem=tempo%10;
            for (int i=1;i<=length;i++){
                mult=mult*rem;
            }
            arm=arm+mult;
            tempo=tempo/10;
        }
        if (arm==no){
            System.out.println("Given No is Armstrong");
        }else {
            System.out.println("Given No is Not Armstrong");
        }
    }
}

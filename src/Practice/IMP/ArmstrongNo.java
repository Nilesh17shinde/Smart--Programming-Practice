package Practice.IMP;

public class ArmstrongNo {
    public static void main(String[] args) {
        int no=153;
        int temp1=no;
        int length=0;
        while (temp1 !=0){
            length=length+1;
            temp1=temp1/10;
        }

        int temp2=no;
        int rem,arm=0;
        while (temp2 !=0){

            int mult=1;
            rem=temp2%10;
            for (int i=1;i<=length;i++){
                mult=mult*rem;
            }
            arm=arm+mult;
            temp2=temp2/10;

        }
if (no==arm){
    System.out.println("Arm");
}else {
    System.out.println("Not");
}
    }
}

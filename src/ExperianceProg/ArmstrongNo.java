package ExperianceProg;

public class ArmstrongNo {
    /*public static void main(String[] args) {
        int no=1534;
        int no1=no;
        int leng=0;
        while (no1!=0){
            no1=no1/10;
            leng=leng+1;
        }
        System.out.println(leng);
        int no2=no;
        int arm=0;
        int rem;
        while (no2!=0){
            rem=no2%10;
            int mult=1;
            for (int i=1;i<=leng;i++) {
                mult = mult * rem;
            }
            arm=arm+mult;
            no2=no2/10;

        }
        if (no==arm){
            System.out.println("Armstrong No");
        }else {
            System.out.println("Not Arm");
        }
    }*/

    public static void main(String[] args) {
        int no=153;
        int temp=no;
        int length=0;
        while (temp!=0){
            temp=temp/10;
            length++;
        }
       int temp1=no;
        int arm=0;
        int rem;
        while (temp1!=0){
            rem=temp1%10;
            int mult=1;
            for (int i=1;i<=length;i++){
                mult=mult*rem;
            }
            arm=arm+mult;
            temp1=temp1/10;

        }
        if (no==arm){
            System.out.println("Armstrog");
        }else {
            System.out.println("Not");
        }
    }
}

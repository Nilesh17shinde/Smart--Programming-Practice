package Practice_16_05;

public class Armstrong_No {
    public static void main(String[] args) {
        int no=152;
        int temp1=no;
        int length=0;
        while (temp1!=0){
            temp1=temp1/10;
            length=length+1;
        }
        System.out.println(length);
        int temp2=no;
        int rem;
        int res=0;
        while (temp2!=0) {
            rem = temp2 % 10;
            int mult = 1;
            for (int i = 1; i <= length; i++) {
                mult = mult * rem;
            }

            res = res + mult;
            temp2=temp2/10;
        }
        System.out.println(res);
        if (res==no){
            System.out.println("Number Armstrong");
        }else {
            System.out.println("Not Armstrong");
        }
    }
}

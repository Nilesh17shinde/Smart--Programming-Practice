package cognizantTask;

public class Task2 {
    public static void main(String[] args) {
        int x=0;
        int y=0;
        for (int outer=0; outer<3;outer++){
            for (int inner=4;inner>1;inner--){
                x=x+2;//Extra Add
                y=y-2;
                if (x==6){
                    break;
                }
                x=x+3;
            }
            y=y-2;
        }
        y=y/4;// Extra add
        System.out.println(x+" "+y);
    }
}

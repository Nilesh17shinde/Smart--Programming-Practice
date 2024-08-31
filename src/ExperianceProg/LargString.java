package ExperianceProg;
// WAP to print largest string for given string array.
public class LargString {
    public static void main(String[] args) {
        String input[]={"Nilesh","Gaurav","Vikas","Ashok","Shubhal","Krushna","Shraddha"};
        int length=input.length;
        String larg=input[0];

        for (int i = 0; i <length ; i++) {
            if (larg.compareTo(input[i])<0){
                larg=input[i];
            }
        }
        System.out.println("Larg String is: "+larg);
    }
}

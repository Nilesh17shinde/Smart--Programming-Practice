package ExperianceProg;
// WAP to print count of less & More numbers of elements in given array.
public class LessandMoreNum {
    public static void main(String[] args) {
        int array[]={1,6,4,22,45,21,65,7,19,31};
        int num=7;
        int mincount=0;
        int maxcount=0;
        for (int i: array){
            if (i<=num){
                mincount++;
            }else {
                maxcount++;
            }
        }
        System.out.println("Minimum elements found in: "+mincount);
        System.out.println("Maximum elements found in: "+maxcount);
    }
}

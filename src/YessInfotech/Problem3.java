package YessInfotech;
/*
* Count character
* input=ABAC output A:2,B:1,C:1
* */
public class Problem3 {
    public static void main(String[] args) {
        String name="ABAC";
        int count=0;
        int count1=0;
        int count2=0;
        for (int i=0;i<name.length();i++){  //count the String Character 0 to n
            if (name.charAt(i)=='A') { // using charAt() count the character by index
                count++; // count the character
            } else if (name.charAt(i)=='B') {
                count1++;
            } else if (name.charAt(i)=='C') {
                count2++;
            }
        }
        System.out.println("A:"+count+", "+"B:"+count1+", "+"C:"+count2);
    }
}

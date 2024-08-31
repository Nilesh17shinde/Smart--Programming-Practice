package ExperianceProg;
// WAP to count how many character in given String using java 8 Features.
// Note: Without count comma & Space(','&' ')
public class CountChar {
    public static void main(String[] args) {
        String str="ab, cdre, xyz";
        int count=0;

        for (int i = 0; i <str.length() ; i++) {
            if (str.charAt(i)!=','&& str.charAt(i)!=' '){
                count ++;
            }
        }
        System.out.println("Number of character is: "+count);
    }
}

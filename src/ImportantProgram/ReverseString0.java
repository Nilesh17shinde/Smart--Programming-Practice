package ImportantProgram;

import java.util.Arrays;

//Reverse a string in n/2 complexity
public class ReverseString0 {
    public static void main(String[] args) {
        String str="Nilesh";
        reverseString(str);
    }
    public static  void reverseString(String str){
        char charArray[]=str.toCharArray();
        int j=charArray.length-1;
        for (int i=0;i<j;i++){
            char temp=charArray[i];
            charArray[i]=charArray[j];
            charArray[j]=temp;
            j--;
        }
        System.out.println(Arrays.toString(charArray));
    }
}

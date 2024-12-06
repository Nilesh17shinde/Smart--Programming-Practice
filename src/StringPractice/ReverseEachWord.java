package StringPractice;

public class ReverseEachWord {
    public static void main(String[] args) {
        String sentence="Nilesh Shinde";
        String str="";
        for (int i=sentence.length()-1;i>=0;i--){
            str=str+sentence.charAt(i);

        }
        System.out.println(str);
        System.out.println("------------------------------------------");

        String reverse=new StringBuilder(sentence).reverse().toString();
        System.out.println(reverse);

        System.out.println("----------------------------------------");

        String[] words=sentence.split(" ");
        StringBuilder  result=new StringBuilder();

        for (String word:words){
            String reverseWord=new StringBuilder(word).reverse().toString();
            result.append(reverseWord+" ");
        }
        System.out.println(result.toString().trim());
    }
}

package StringPractice;

public class ReverseWord {
    public static void main(String[] args) {
        String sentence="Nilesh Shinde";
        String[] words=sentence.split(" ");
        for (int i=words.length-1;i>=0;i--){
            System.out.print(words[i]+" ");
        }
    }
}

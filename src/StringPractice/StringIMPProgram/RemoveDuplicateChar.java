package StringPractice.StringIMPProgram;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateChar {
    public static void main(String[] args) {
        String str="sNileesshhsN";
//        Approch1 Java8
        StringBuilder sb=new StringBuilder();
        str.chars().distinct().forEach(c->sb.append((char) c));
        System.out.println(sb);
        System.out.println("------------------------------------");

//        Approch 2
        StringBuilder builder=new StringBuilder();
        for (int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            int indx=str.indexOf(ch,i+1);
            if(indx==-1){
                builder.append(ch);
            }
        }
        System.out.println(builder);

//  Approch 3 Character arreay to remove duplucate
        System.out.println("---------------------------------------");
        char[] ch=str.toCharArray();
        StringBuilder builder1=new StringBuilder();
        for (int i=0;i<ch.length;i++){
            boolean repeted=false;
            for (int j=i+1;j<ch.length;j++){
                if (ch[i]==ch[j]){
                    repeted=true;
                    break;
                }
            }
            if(!repeted){
                builder1.append(ch[i]);
            }
        }
        System.out.println(builder1);

//        Approch 4 Using Set Interface
        System.out.println("---------------------------------------------");

        StringBuilder stringBuilder=new StringBuilder();
        Set<Character> set=new LinkedHashSet<>();
        for (int i=0;i<str.length();i++){
            set.add(str.charAt(i));
        }
        System.out.println(stringBuilder);
        for (Character c:set){
            stringBuilder.append(c);
        }
        System.out.println(stringBuilder);
    }
}

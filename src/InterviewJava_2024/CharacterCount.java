package InterviewJava_2024;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

//{a=3, b=3, c=2}
public class CharacterCount {
    public static void main(String[] args) {
        String str = "aaabbbcc";

//        way 1
        /*Map<Character,Integer> map = new HashMap<>();

        for (int i=0;i<str.length();i++){
            if (map.containsKey(str.charAt(i))){
                map.put(str.charAt(i),map.get(str.charAt(i))+1);
            }else{
                map.put(str.charAt(i),1);
            }
        }
        System.out.println(map);*/

//        way 2
        Map<String,Long> map= Arrays.stream(str.split(""))
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println(map);
    }
}

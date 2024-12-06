package Java8Features.Practice;

import java.util.Arrays;
import java.util.Collections;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

import static java.util.Collections.*;
import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;

public class ReverseWord {

    public static void main(String[] args) {
        String input="I Love Programming very much!";
        String str[]=input.split("");
        for (int i=str.length-1;i>=0;i--){
            System.out.print(str[i]);
        }

        System.out.println("------------------------------------------");
        char ch='.';
        input=input.replace(' ',ch);
        System.out.println(input);

        //input: I.Love.Programming.very.much!
        //output: much.very.Programming.Love.I

input=input.substring(0,input.length()-1);
        String output = Arrays.stream(input.split("\\."))
                        .sorted((a,b)->-1)
                        .collect(Collectors.joining("."))+"!";

        System.out.println(output);

        Map<String,Long> map=Arrays.stream(input.split(""))
                .collect(groupingBy(Function.identity(),counting()));
        System.out.println(map);
    }

}

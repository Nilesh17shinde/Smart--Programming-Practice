package All_Patterns;

import com.sun.tools.javac.Main;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*List<String> valuesTray = Arrays.asList("A", "1", "B", "C", "10", "EYE", "50", "49", "@#");

Insert pipe symbols in between the string characters if the string length is greater than 1.

example output : 1|0 ,  E|Y|E*/
public class DemoCode {
    public static void main(String[] args) {
        List<String> valuesTray = Arrays.asList("A", "1", "B", "C", "10", "EYE", "50", "49", "@#");
//       List<String> list= valuesTray.stream().filter(i->i.length()>1).map(i->i+"|").collect(Collectors.toList());
//        System.out.println(list);

//        List<String> value=  valuesTray.stream()
//                .map(s->s.length() > 1 ? Arrays.stream(s.split("")).collect(Collectors.joining("|")): s)
//                .collect(Collectors.toList());
//        value.forEach(System.out::println);

        List<String> result=valuesTray.stream().map(DemoCode::addPipesIfNecessary).toList();

        // Print the result
        result.forEach(System.out::println);
    }
        private static String addPipesIfNecessary(String value) {
            if (value.length() > 1) {
                return value.chars().mapToObj(c -> String.valueOf((char) c)).collect(Collectors.joining("|"));}
            else { return value;}
        }
}

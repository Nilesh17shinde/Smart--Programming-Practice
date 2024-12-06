package YessInfotech;

import java.util.HashMap;
import java.util.Map;

public class OtherDemo {
    public static void main(String[] args) {
        String str = "aaabbbc";
        Map<Character, Integer> map = new HashMap<>();
        // Count the frequency of each character
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        // Construct the output string
        StringBuilder output = new StringBuilder();
        map.forEach((key, value) -> {
            for (int i = 0; i < value; i++) {
                output.append(key);
            }
            output.append(value);
        });

        // Print the result
        System.out.println(output.toString());
    }
}

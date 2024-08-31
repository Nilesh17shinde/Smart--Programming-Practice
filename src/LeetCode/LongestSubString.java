package LeetCode;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
/*
* Given a string s, find the length of the longest substring without repeating characters.
Example 1:

Input: s = "abcabcbb"
Output: 3
Explanation: The answer is "abc", with the length of 3.*/
public class LongestSubString {
    static int lengthOfLongestString(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }

        int maxLength = 0;
        int start = 0;

        Map<Character, Integer> charIndexMap = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (charIndexMap.containsKey(c) && charIndexMap.get(c) >= start) {
                start = charIndexMap.get(c) + 1;
            }
            charIndexMap.put(c, i);
            maxLength = Math.max(maxLength, i - start + 1);
        }
        return maxLength;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your String: ");
        String str = sc.nextLine();
        System.out.println(lengthOfLongestString(str));
    }
}
/*
* Given a string s, find the length of the longest substring without repeating characters.
Example 1:

Input: s = "abcabcbb"
Output: 3
Explanation: The answer is "abc", with the length of 3.
Example 2:

Input: s = "bbbbb"
Output: 1
Explanation: The answer is "b", with the length of 1.
Example 3:

Input: s = "pwwkew"
Output: 3
Explanation: The answer is "wke", with the length of 3.
Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.
Example 4:

Input: s = ""
Output: 0

Link to challenge: https://leetcode.com/problems/longest...
* */
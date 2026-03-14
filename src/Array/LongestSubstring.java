package Array;
//Longest Substring Without Repeating Characters
//Given a string s, find the length of the longest substring without duplicate characters.
//Input: s = "abcabcbb"
//Output: 3
//Explanation: The answer is "abc", with the length of 3. Note that "bca" and "cab" are also correct answers.
//Example 2:
//
//Input: s = "bbbbb"
//Output: 1
//Explanation: The answer is "b", with the length of 1.
//Example 3:
//
//Input: s = "pwwkew"
//Output: 3
//Explanation: The answer is "wke", with the length of 3.
//Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.

import java.util.HashSet;

public class LongestSubstring {
    public static void main(String [] args){
        HashSet<Character> set = new HashSet<>();
        String s = "abcabcbb";
        int left =0;
        int maxLength = 0;
        for(int right=0;right<s.length();right++){
            while(set.contains(s.charAt(right))){
                set.remove(s.charAt(left));
                left++;
            }
            set.add(s.charAt(right));
            maxLength = Math.max(maxLength,set.size());
        }
        System.out.println(maxLength);
    }
}

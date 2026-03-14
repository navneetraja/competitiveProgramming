package Array;
//242. Valid Anagram
//Given two strings s and t, return true if t is an anagram of s, and false otherwise.
//Example 1:
//Input: s = "anagram", t = "nagaram"
//Output: true
//Example 2:
//Input: s = "rat", t = "car"
//Output: false

public class Anagram {

    public static void main(String [] args){
        String s = "anagram", t = "nagaram";
        boolean isAnagram = checkAnagram(s, t);
        System.out.println("isAnagram : "+isAnagram);

    }
    private static boolean checkAnagram(String s, String t) {
        int [] arr = new int[26];
        if(s.length() != t.length()){
            return false;
        }
        for(int i = 0; i< s.length(); i++){
            arr[s.charAt(i)-'a']++;
            arr[t.charAt(i)-'a']--;
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                return false;
            }
        }
        return true;
    }
}

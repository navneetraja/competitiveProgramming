package Array;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

//Given a string s, find the first non-repeating character in it and return its index. If it does not exist, return -1.
//Example 1:
//Input: s = "leetcode"
//Output: 0
//Explanation:
//The character 'l' at index 0 is the first character that does not occur at any other index.
//Example 2:
//Input: s = "loveleetcode"
//Output: 2
//Example 3:
//Input: s = "aabb"
//Output: -1
public class FirstUniqueCharacter {

    public static void main(String [] args){
        Map<Character, Integer> map = new HashMap<>();
        String s = "loveleetcode";
        char [] ch = s.toCharArray();
        for(Character c : ch){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        int index = -1;
        for(int i=0;i< ch.length;i++){
            if(map.get(ch[i]) == 1){
                index = i;
                break;
            }
        }
        System.out.println("index : "+index);


    }

}

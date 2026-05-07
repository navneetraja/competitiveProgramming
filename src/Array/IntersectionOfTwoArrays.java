package Array;

import java.util.HashSet;
//349. Intersection of Two Arrays
//Given two integer arrays nums1 and nums2, return an array of their intersection. Each element in the result must be unique and you may return the result in any order.
// Example 1:
//Input: nums1 = [1,2,2,1], nums2 = [2,2]
//Output: [2]
//Example 2:
//Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
//Output: [9,4]
//Explanation: [4,9] is also accepted.
public class IntersectionOfTwoArrays {

    public static void main(String [] args){
        int [] nums1 = {4,9,5}, nums2 = {9,4,9,8,4};
        HashSet<Integer> set = new HashSet<>();
        HashSet<Integer> result = new HashSet<>();

        for(int i:nums1){
            set.add(i);
        }
        for(int i:nums2){
            if(set.contains(i)){
                result.add(i);
            }
        }
        for(int i:result){
            System.out.print(" "+i);
        }

    }
}

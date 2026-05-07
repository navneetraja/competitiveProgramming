package Array;

import java.util.ArrayList;
import java.util.List;

//560. Subarray Sum Equals K
//Given an array of integers nums and an integer k, return the total number of subarrays whose sum equals to k.
//A subarray is a contiguous non-empty sequence of elements within an array.
//Example 1:
//Input: nums = [1,1,1], k = 2
//Output: 2
//Example 2:
//Input: nums = [1,2,3], k = 3
//Output: 2
public class subArraySum {

    public static void main(String [] args){
        int [] nums = {1,2,3};
        int k = 3;
        List<Integer> list = new ArrayList<>();
        int count =0;
        int numberOfSubArray = 0;
        for(int i=0;i< nums.length;i++){
            count +=nums[i];
            if(count == k){
                numberOfSubArray++;
            }
        }
        System.out.println("numberOfSubArray : "+numberOfSubArray);
    }
}


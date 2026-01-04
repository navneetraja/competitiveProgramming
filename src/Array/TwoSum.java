package Array;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public static void main(String [] args){
        int [] nums = {2,7,11,15};
        int target =18;
        int [] sum = getSum(nums,target);
        for(int i=0;i<sum.length;i++){
            System.out.print(" "+sum[i]);
        }
    }

    public static int[] getSum(int [] nums,int target){
        Map<Integer,Integer> map = new HashMap<>();
        for(int i =0;i<nums.length;i++){
            int temp = target - nums[i];
            if(map.containsKey(temp)){
                return new int []{map.get(temp),i};
            }
            map.put(nums[i],i);
        }
        return new int [] {};
    }
}

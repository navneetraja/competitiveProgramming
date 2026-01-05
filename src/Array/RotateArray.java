package Array;

import java.util.Arrays;

//Input: nums = [1,2,3,4,5,6,7], k = 3
//Output: [5,6,7,1,2,3,4]
public class RotateArray {
    public static void main(String [] args){

        int [] nums = {1,2,3,4,5,6,7};
        int len = nums.length;
        int[] rotatednums = new int[len];
        int k=3;

        for(int i=0;i<len;i++){


            if((i+k)<len){
                System.out.println(" f "+(i+k));
                System.out.println(" fi "+i);
                System.out.println(" fv "+(nums[i]));
                nums[i+k] = nums[i];
            } else {
                System.out.println(" s "+(i+k));
                System.out.println(" si "+i);
                System.out.println(" sv "+(nums[i]));
                nums[((i+k)-len)] = nums[i];
            }
        }

        Arrays.stream(nums).forEach(arr->{
            System.out.print(" "+arr);
        });
    }

}

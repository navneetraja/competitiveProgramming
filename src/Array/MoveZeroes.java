package Array;

//283. Move Zeroes
//Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.
//Note that you must do this in-place without making a copy of the array.
//Example 1:
//Input: nums = [0,1,0,3,12]
//Output: [1,3,12,0,0]
//Example 2:
//Input: nums = [0]
//Output: [0]

public class MoveZeroes {

    public static void main(String [] args){

        int [] arr = {1,2,4,0,0,5,0,9};

        int j=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
        }

        for(int i=0;i< arr.length;i++){
            System.out.print(" "+arr[i]);
        }
    }

}

package Array;

import java.util.Arrays;

public class MoveZeroes {

    public static void main(String [] args){

        int [] arr = {1,2,4,0,0,5,0,9};

        int j=0;
        for(int i=0;i< arr.length;i++){
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

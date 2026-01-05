package Array;

import java.util.Arrays;

public class reverseArray {

    public static void main(String [] args){
        int [] arr = {1,2,3,4,5,6,7};
        int n = arr.length;
        int k=3;
        k = k%n;

        reverse(arr,0,n-1);   //Reverse whole array
        reverse(arr,0,k-1);  //Reverse first k elements
        reverse(arr,k,(n-1));         // Reverse remaining elements

        Arrays.stream(arr).forEach(a->{
            System.out.print(" "+a);
        });
    }

    public static int [] reverse(int [] arr, int start, int end){
        System.out.println("start "+start);
        System.out.println("end "+end);
        while(start<end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        return arr;
    }
}

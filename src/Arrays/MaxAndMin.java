package Arrays;

public class MaxAndMin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr [] = {2,5,7,8,1,8,9};
		
		//System.out.println(arr.length);
		for(int i=0;i<arr.length-1;i++) {
		 for(int j = i+1;j<arr.length-1;j++) {
			 if(arr[i]>arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
		 }
		}
		
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}

		//System.out.println(arr.length);
	}

}

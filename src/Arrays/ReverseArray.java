package Arrays;

public class ReverseArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "abc";
		String rev = "";
		for(int i=str.length();i>0;i--) {
			System.out.println(i);
			rev = rev + str.charAt(i-1);
		}
		System.out.println(rev);

	}

}

package arrayQuestions;

public class pali {
	public static boolean isPalindrome(int[]arr) {
		for(int i=0;i<arr.length/2;i++) {
			if(arr[i]!=arr[arr.length-1-i]) {
				return false;
			}
		}
		return true;
	}

}

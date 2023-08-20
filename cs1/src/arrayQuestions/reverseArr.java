package arrayQuestions;

public class reverseArr {
	public static int[] rev(int[]arr) {
		int a[]=new int[arr.length];
		for(int i=0;i<arr.length;i++) {
			a[i]=arr[a.length-i-1];
		}
	return a;
	}
}

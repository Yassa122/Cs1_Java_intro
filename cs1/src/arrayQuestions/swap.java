package arrayQuestions;

public class swap {
	public static void swap(int[]a) {
		int[] newArr=new int[a.length];
		
        for (int i = 0; i < a.length; i++) {
            newArr[i] = a[a.length -1 - i];
        }
        for (int i = 0; i < newArr.length; i++) {
            System.out.print(newArr[i] + " ");
        }
        System.out.println();
  
		}
	public static void main(String[] args) {
		int x[]= {1,2,3,4,5};

	swap(x);
	}
	
}

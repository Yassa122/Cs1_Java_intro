package arrayQuestions;

public class display {
	
	public static void display(int[] array) {
	    for (int i = 0; i < array.length; i++) {
	        System.out.print(array[i] + " ");
	    }
	    System.out.println(); 
	}
	public static void main(String[] args) {
		int []x= {1,2,3,4};
			display(x);
	}
}

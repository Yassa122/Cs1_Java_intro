package arrayQuestions;

public class ascendingOrder {
		public static boolean isIncreasing(int []a) {
			boolean flag=true;
			 for (int i = 0; i < a.length - 1; i++) {
		            if (a[i] > a[i + 1]) {
		                return false;
		            }
		        }
		        return flag;
		    }
}

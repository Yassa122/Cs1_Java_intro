package week4;

public class subset {
	public static boolean subset(int[] arr1, int[] arr2) {
	    for (int i = 0; i < arr1.length; i++) {
	        boolean found = false;
	        for (int j = 0; j < arr2.length; j++) {
	            if (arr1[i] == arr2[j]) {
	                found = true;
	                break;
	            }
	        }
	        if (!found) {
	            return false; 
	        }
	    }
	    return true;
	}

	public static void main(String[] args) {
	    System.out.println(subset(new int[]{1, 2, 3}, new int[]{1, 2, 3, 5, 6}));
	    System.out.println(subset(new int[]{1, 2, 3}, new int[]{2, 4, 5, 1, 3})); 
	    System.out.println(subset(new int[]{}, new int[]{1, 2, 3, 5, 6}));        
	    System.out.println(subset(new int[]{1, 2, 3}, new int[]{2, 4, 5, 1}));   
	}

}

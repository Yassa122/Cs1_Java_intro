package arrayQuestions;

public class findSecondLargest {
	public static int largest(int[]x) {
		int largest=0;
		int secondLargest=0;
		
		if (x[0] > x[1]) {
            largest = x[0];
            secondLargest = x[1];
        } else {
            largest = x[1];
            secondLargest = x[0];
        }

        for (int i = 2; i < x.length; i++) {
            if (x[i] > largest) {
                secondLargest = largest;
                largest = x[i];
            } else if (x[i] > secondLargest && x[i] != largest) {
                secondLargest = x[i];
            }
        }
        return secondLargest;
	}
}

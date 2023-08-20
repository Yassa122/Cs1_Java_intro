package arrayQuestions;

public class reverse {
	
    public static int[] reverse(int[] a) {
        int[] reversedArray = new int[a.length];

        for(int i = 0; i < a.length; i++) {
            reversedArray[i] = a[a.length - 1 - i];
        }

        return reversedArray;
    }

    public static void main(String[] args) {
        int[] testArray = {1, 2, 3, 4, 5};
        int[] reversed = reverse(testArray);

        for(int i : reversed) {
            System.out.print(i + " ");
        }
    }
}

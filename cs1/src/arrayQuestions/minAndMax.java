package arrayQuestions;

public class minAndMax {
    public static int min(int[] a) {
        if (a.length == 0) {
            throw new IllegalArgumentException("Array must not be empty");
        }

        int min = a[0];
        for (int i = 1; i < a.length; i++) {
            if (a[i] < min) {
                min = a[i];
            }
        }
        return min;
    }

    public static int max(int[] a) {
        if (a.length == 0) {
            throw new IllegalArgumentException("Array must not be empty");
        }

        int max = a[0];
        for (int i = 1; i < a.length; i++) {
            if (a[i] > max) {
                max = a[i];
            }
        }
        return max;
    }

    // Test method
    public static void main(String[] args) {
        int[] testArray = {1, 2, 3, 4, 5};
        int minVal = min(testArray);
        int maxVal = max(testArray);

        System.out.println("Min value: " + minVal);
        System.out.println("Max value: " + maxVal);
    }
}

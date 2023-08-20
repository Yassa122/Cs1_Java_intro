package arrayQuestions;

public class rotateElements {

    public static int[] rotate(int[] arr, int k) {
        int n = arr.length;
        int[] newArr = new int[n];

        k = k % n;

        for (int i = 0; i < n; i++) {
            int newIndex = (i + k) % n;
            newArr[newIndex] = arr[i];
        }

        return newArr;
    }

}

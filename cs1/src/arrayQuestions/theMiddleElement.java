package arrayQuestions;

public class theMiddleElement {

    public static double findMiddle(int[] arr) {
        int n = arr.length;

        if (n % 2 == 0) {
            return (arr[n / 2] + arr[n / 2 - 1]) / 2.0;
        } else {
            return arr[n / 2];
        }
    }

}

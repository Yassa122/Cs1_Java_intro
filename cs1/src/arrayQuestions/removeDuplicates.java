package arrayQuestions;

public class removeDuplicates {

    public static int[] remove(int[] arr) {
        int n = arr.length;
        
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; ) {
                if (arr[i] == arr[j]) {
                    for (int k = j; k < n - 1; k++) {
                        arr[k] = arr[k + 1];
                    }
                    n--;  
                } else {
                    j++;  
                }
            }
        }
        
        int[] result = new int[n];
        for (int i = 0; i < n; i++) {
            result[i] = arr[i];
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 2, 3, 4, 4, 5};
        int[] result = remove(nums);

        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}

package week4;

public class split {
    public static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public static void split(int[] array, int pivot, int size) {
        int j = 0; 
        for (int i = 0; i < size; i++) {
            if (array[i] <= pivot) {
                swap(array, i, j);
                j++;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {13, -42, 8, 35, -7, 46, 28, -19};
        int pivot = 10;
        split(arr, pivot, arr.length);
        System.out.println("Partitioned array is: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

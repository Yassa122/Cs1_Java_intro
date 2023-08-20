package arrayQuestions;

public class sumDiagonal {
    
    public static int sumDiagonal(int[][] a) {
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            if(i < a[i].length) { 
                sum += a[i][i];
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        int a[][] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int res = sumDiagonal(a);
        System.out.println(res); 
    }
}

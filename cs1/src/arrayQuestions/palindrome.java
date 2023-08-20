package arrayQuestions;

public class palindrome {

    public static boolean isPalindrome(char[] arr) {
        for (int i = 0; i < arr.length / 2; i++) {
            if (arr[i] != arr[arr.length - 1 - i]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        char[] testArray1 = {'r', 'a', 'c', 'e', 'c', 'a', 'r'};
        char[] testArray2 = {'h', 'e', 'l', 'l', 'o'};
        
        System.out.println(isPalindrome(testArray1)); 
        System.out.println(isPalindrome(testArray2));
    }
}

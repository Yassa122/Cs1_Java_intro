package charGPTRecursionQuestions;
import java.util.*;
public class permutations  {
    public static void main(String[] args) {
        printPermutations("abc", "");
    }

    public static void printPermutations(String str, String ans) {
        if (str.length() == 0) {
            System.out.println(ans);
            return;
        }

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            String ros = str.substring(0, i) + str.substring(i + 1);

            printPermutations(ros, ans + ch);
        }
    }
}



/*Write a Java program that will print
 *  all the permutations of a given string using recursion.*/
 
package week4;
import java.util.*;

public class palindrome {
    public static void main(String[] args) {
        char c[]={'r','a','d','a','r'};
        boolean flag=true;
        for(int i=0; i<c.length/2; i++) {
            if(c[i] != c[c.length-i-1]) {
                flag=false;
                break;
            }
        }
        if(flag) {
            System.out.println("The given character array is a palindrome.");
        } else {
            System.out.println("The given character array is not a palindrome.");
        }
    }
}

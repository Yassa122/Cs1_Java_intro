/*Write a recursive Java method that reverses a string.*/
package charGPTRecursionQuestions;
import java.util.*;
public class reverseString {
	public static String reverse(String s) {
		if(s.length()==0||s.length()==1) {
			return s;
		}else {
			return  reverse(s.substring(1))+s.charAt(0);
		}
	}
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the string");
		
		String s=sc.nextLine();
		String res=reverse(s);
		System.out.println(res);
	}
	
}
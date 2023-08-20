package charGPTRecursionQuestions;
import java.util.*;
public class sumOfDigits {

	public static int sum(int n) {
		if(n<10) {
			return n;
		}else {
			return n%10+sum(n/10);
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		int x=sc.nextInt();
		int res=sum(x);
		System.out.println(res);
	}
}




/*Question:

Write a recursive Java method 
that calculates the sum of digits
 of a non-negative integer.*/
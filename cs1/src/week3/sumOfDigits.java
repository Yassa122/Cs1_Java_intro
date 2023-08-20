package week3;
import java.util.*;
public class sumOfDigits {

	
	
	public static int sum(int n) {
		if(n<10) {
			return n;
		}else {
			return n%10+ sum(n/10);
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number to calculate the sum of every digit");
		int x=sc.nextInt();
		int res=sum(x);
		System.out.println(res);
	}
}

package week3;
import java.util.*;
public class prime {
	public static boolean prime(int n) {
		if(n==1) {
			return true;
		}else {
			return prime(n,n-1);
		}
	}
	public static boolean prime(int n,int d) {
		if(d==1) {
			return true;
		}else if(n%d==0){
			return false;
		}else {
			return prime(n,d-1);
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		int x=sc.nextInt();
		boolean result=prime(x);
		System.out.println(result);
	}
}

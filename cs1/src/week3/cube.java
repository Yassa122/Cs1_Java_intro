package week3;
import java.util.*;
public class cube {
	public static int square(int n) {
		if(n==1) {
			return n;
		}else {
			return square(n-1)+2*n-1;
		}
	}
	public static int cube(int n) {
		if(n==1) {
			return n;
			
		}else {
			return cube(n-1)+(3*square(n)-(3*n)+1);
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int n=sc.nextInt();
		int res=cube(n);
		System.out.println(res);
	}
}

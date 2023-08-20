package week3;
import java.util.*;
public class blastOff {
	public static void countdown(int n) {
		if(n==0) {
			System.out.println("blastoff");
		}else {
			System.out.println(n);
			 countdown(n-1);
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		countdown(n);
	}
}

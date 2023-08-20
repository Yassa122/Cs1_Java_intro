package week2;
import java.util.*;
public class GCD {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the first number");
		int a= sc.nextInt();
		System.out.println("enter the second number");
		int b=sc.nextInt();
		
		while(a!=b) {
			if(a>b) {
				a-=b;
			}else {
				b-=a;
			}
		}
		System.out.println("the GCD is "+a);
	}
}

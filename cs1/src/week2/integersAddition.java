package week2;
import java.util.*;
public class integersAddition {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("how many integers will be added ?");
		int intgs=sc.nextInt();
		int sum=0;
		for (int i = 0; i < intgs; i++) {
			System.out.println("enter integer"+ (i+1));
			int x=sc.nextInt();
			sum+=x;
			System.out.println("the sum of all integers is"+sum);
		}
	}
}

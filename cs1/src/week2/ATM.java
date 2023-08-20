package week2;
import java.util.*;
import java. lang. Math;
public class ATM {
	public static void main (String[]args) {
		Scanner sc= new Scanner(System.in);
		int rand= (int)(Math.random()*9000)+1000;
		System.out.println("your pincode is"+rand);
		
		System.out.println(" enter your pin code ");
		int trials=3;
		for(int i=0;i<trials;i++) {
			int input=sc.nextInt();

			if(input!=rand) {
				System.out.println("incorrect pin");
			}else {
				System.out.println("correct pin");
			}
		}
	}
}

package week1;
import java.util.*;
public class quadraticEquation {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter the value of a");
		double a=sc.nextDouble();
		
		System.out.println("enter the value of b");
		double b=sc.nextDouble();
		
		System.out.println("enter the value of c");
		double c=sc.nextDouble();
		
		double x1=((-b)+Math.sqrt((b*b)-(4*a*c)))/2*a;
		double x2=((-b)-Math.sqrt((b*b)-(4*a*c)))/2*a;
		
		double res1=((b*b)-(4*a*c));
		if(a==0||res1<0) {
			System.out.println("No solution !");
		}else {	
		System.out.println("the results are "+x1);
		System.out.println("the results are "+x2);
		}
		

	}
}


//-b+- rootb*b-4*a*c/2*a
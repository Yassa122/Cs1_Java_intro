package week1;
import java.util.*;
public class pastaCooking {
	public static void main (String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the diameter");
		double diam=sc.nextDouble();
		System.out.println("enter the height");
		double height=sc.nextDouble();
		double radius =diam*2;
		double pi=3.14;
		double volume= radius*radius*height*pi;
		double liters=volume*1000;
		double time=liters*2;
		
		System.out.println("Stove time is"+time);
	}
}

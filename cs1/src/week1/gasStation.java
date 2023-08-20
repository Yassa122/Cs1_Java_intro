package week1;
import java.util.*;
public class gasStation {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	
		System.out.println("enter the tank Capacity");
		int tank=sc.nextInt();
		
		System.out.println("enter Gas Gauge Reading in percent: ");
		int gas=sc.nextInt();
		
		System.out.println("enter Miles per Gallon: ");
		int miles=sc.nextInt();
		
		int dist=tank*miles;
		
	
		
		if(gas>=25) {
			System.out.println("quarter");
			
		}
	}
}

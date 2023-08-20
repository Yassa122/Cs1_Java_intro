package week1;
import java.util.*;
public class suitCase {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter the weight of the 1st suitcase");
		int s1=sc.nextInt();
		
		System.out.println("enter the weight of the 2nd suitcase");
		int s2=sc.nextInt();
		
		
		if(s1>23){
			
			if(s1>32) {
				System.out.println("suitcase 1 rejected");
			}
			else {
			s1-=23 ;
			s1*=50;
			System.out.println("you're 1st suitcase charge = "+s1+"$");
			}
		}else {
			System.out.println("your charge is 0$");
		}
		
		if(s2>23){
			
			if(s2>32) {
				System.out.println("suitcase 2 rejected");
			}else {
			s2-=23;
			s2*=50;
			
			System.out.println("you're 2nd suitcase charge = "+s2+"$");
			}
		}else {
			System.out.println("your charge is 0$");
		}
		System.out.println("your total charge is : "+(s1+s2)+"$");
	}
	
}

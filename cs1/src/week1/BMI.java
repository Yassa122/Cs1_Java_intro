package week1;
import java.util.*;
public class BMI {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter your height");
		double height=sc.nextDouble();
		
		System.out.println("enter your weight in kg");
		double weight=sc.nextDouble();
		
		double BMI=weight/(height*height);
		
		if(BMI<25) {
			if(BMI<18){
				System.out.println("you're under weight");
			}else {
			System.out.println("you're fit");
			}
		}else 
		System.out.println("your over weight");
	}
}

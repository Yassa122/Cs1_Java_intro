package week1;
import java.util.*;
public class grading {
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	
	System.out.println("enter your grade number");
	double grade=sc.nextDouble();
	
	if(grade>105||grade<=0) {
		System.out.println("you can't score more or less than this input number");
	}else if(grade>=85) {
		System.out.println("you got: A");
	}else if(grade<50) {
		System.out.println("you got: F");
	}else if(grade<60) {
		System.out.println("you got: D");
	}else if(grade<74) {
		System.out.println("you got: C");
	}else if(grade<84) {
		System.out.println("you got: B");
	}
	
}
}

package week3;
import java.util.*;
public class naturalLog {
	public static double factorial(double f) {
		if(f==0) {
			return 1;
		}else {
			
			return f*factorial(f-1);
		}
	}
	
	public static double constantRec(int f) {
		if(f==0) {
			return 1;
		}else {
			return f/factorial(f)+constantRec(f-1);
		}
		
	}
	
	public static void main(String[] args) {
		int f=8;
		double res=constantRec(f);
		System.out.println(res);
	}
}

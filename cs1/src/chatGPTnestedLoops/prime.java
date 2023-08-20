package chatGPTnestedLoops;
import java.util.*;
public class prime {
public static boolean isPrime(int n) {
	boolean res=true;
	if(n==1) {
		res= true;
	}else if(n==0) {
		res=false;
		for(int i=2;i<n;i++) {
			if(n%i==0) {
				res=false;
			}
			
		}
		
		}
	
		return res;
	
	
}
}

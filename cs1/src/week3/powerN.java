package week3;
import java.util.*;
public class powerN {
	public static int powerOfN(int x,int n) {
		if(n==0) {
			return 1;
		}else 
		if(n%2==0){
			return powerOfN(x,n/2)*powerOfN(x,n/2);
			
		}	else {
			return powerOfN(x,n-1)*x;
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		int n=sc.nextInt();
		int res=powerOfN(x,n);
		
		System.out.println(res);
	}
}

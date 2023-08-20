package week1;
import java.util.*;
public class cartPlane {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the X-coordinate");
		int x=sc.nextInt();
		System.out.println("enter the Y-coordinate");
		int y=sc.nextInt();
		
		if(x>0&&y>0) {
			System.out.println("plane-1");
		}else if(x==0&&y==0) {
			System.out.println("origin");
		}else if(x==0) {
			System.out.println("Y-axis");
		}else if(y==0) {
			System.out.println("X-axis");
		}else if(x<0&&y>0) {
			System.out.println("plane-2");
		}else if(x<0&&y<0) {
			System.out.println("plane-3");
		}else {
			System.out.println("plane-4");
		}
		
	}

}

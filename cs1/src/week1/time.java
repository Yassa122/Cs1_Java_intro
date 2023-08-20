package week1;
import java.util.*;

public class time {	
		public static void main(String[]args) {
			System.out.println("enter the number of seconds");
			Scanner sc= new Scanner(System.in);
			int x,minutes,hours;
			 x=sc.nextInt();
			 hours=x/3600;
			x=x%3600;
			 minutes=x/60;
			x=x%60;
			System.out.println(hours+":"+minutes+":"+x);
		}
	
}

package week3;
import java.util.*;
public class reverseString {
	public static String Reverse(String s) {
		if(s.length()==0) {
			return"";
		}else {
			return Reverse(s.substring(1)+s.charAt(0));
		}
		
	}
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the string");
		
		String s=sc.nextLine();
		String res=Reverse(s);
		System.out.println(res);
	}
	
}

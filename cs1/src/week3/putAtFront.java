package week3;
import java.util.*;
public class putAtFront {
	public static String putAtfront(String s, char c) {
		if(s.length()==0) {
			return s;
		}else
			if(s.charAt(s.length()-1)==c){
				return c+putAtfront(s.substring(0,s.length()-1),c);
			}else {
				return putAtfront(s.substring(0,s.length()-1),c)+s.charAt(s.length()-1);
			}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a string");
		String s=sc.nextLine();
		char c=sc.nextLine().charAt(0);
		String res=putAtfront(s,c);
		System.out.println(res);
	}
}

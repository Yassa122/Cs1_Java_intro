package week2;
import java.util.*;
public class stringMan {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter the 1st String");
		String str1=sc.nextLine();
		
		System.out.println("enter the 2nd String");
		String str2=sc.nextLine();			
		boolean flag=true;


		if(str1.length()!=str2.length()) {
			System.out.println("Strings don;t match");
		}else {
			
		
		for (int i = 0; i < str1.length()&& flag == true; i++) {

			if(str1.charAt(i)!=str2.charAt(i)) {
				flag=false;
				break;
			}
			
		}
		if(flag) {
			System.out.println("matching");
		}else {
			System.out.println("not matching");
			
		
		}
		}
		}
}

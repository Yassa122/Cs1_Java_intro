package week3;
import java.util.*;
public class palindromeRec {
	public static boolean palindrome(String s) {
		if(s.length()==0||s.length()==1) 
			return true;
		 if(s.charAt(0)==s.charAt(s.length())-1) 
		return palindrome(s.substring(1,s.length()-1));
		return false;	
	}
}

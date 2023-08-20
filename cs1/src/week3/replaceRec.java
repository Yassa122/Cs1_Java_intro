package week3;
import java.util.*;
public class replaceRec {
	public static String replace(String s,char c) {
		if(s.length()==0) {
			return "";			
		}else
			if(s.charAt(0)!=c) {
				return s.charAt(0)+replace(s.substring(1),c);
			}else {
				return "*"+replace(s.substring(1),c);
			}
	}
}

package week3;
import java.util.*;
public class noOfDigi {
	public static int noOfDig(int n) {
		if(n<10) {
			return 1;
		}else {
			return noOfDig(n/10)+1;
		}
	}
}

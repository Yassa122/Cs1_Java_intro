package week3;
import java.util.*;
public class multiplyRec {
	public static int multiplyRec(int x,int y) {
		if(y==0) {
			return 0;
		}else {
			return (x+multiplyRec(x,y-1));
		}	
	}
	public static void main(String[] args) {
		System.out.println(multiplyRec(5,2));
	}
}

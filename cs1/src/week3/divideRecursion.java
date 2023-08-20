package week3;
import java.util.*;
public class divideRecursion {
	public static int divideRec(int x,int y) {
		if(y<=0) {
			System.out.println("can't divide by 0 or a negative number");
			return -1;
		}else if(x<y){
			return 0;
		}else {
			return 1+divideRec(x-y,y);
		}
		
	}
	public static void main(String[] args) {
		System.out.println(divideRec(10,5));
	}
}

package week4;
import java.util.*;
public class array1 {
	public static void main(String[] args) {

		int []x= {1,4,77,54,23,100};
		int smallest=x[0];
		int  largest=x[0];
		int sum = 0;
		for(int i=0;i<x.length;i++) {
			if(x[i]>largest) {
				largest=x[i];
			}if(x[i]<smallest) {
				smallest=x[i];
			}
			sum+=x[i];
		}
		System.out.println(largest);
		System.out.println(smallest);
		System.out.println(sum/x.length);

	}
	
}

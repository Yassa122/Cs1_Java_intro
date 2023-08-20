package week4;
import java.util.*;
public class unionIntersection {

	public static void intersect(int x[],int y[]) {
		for(int i=0;i<x.length;i++) {
			for(int j=0;j<y.length;j++) {
					if(x[i]==y[j]) {
						System.out.println(y[j]+"");
				}			
			}
		}
	}
	public static void union (int x[],int y[]) {
		for(int i=0;i<x.length;i++) {
		System.out.println(x[i]+"");
			}
			for(int j=0;j<y.length;j++) {
				boolean flag=true;
				for(int i=0;i<x.length;i++) {
					if(x[i]==y[j]) {
						flag=false;
					}
				}
				if(flag) {
					System.out.println();
				}
			}
	}
}

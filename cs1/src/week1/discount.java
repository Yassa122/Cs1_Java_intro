package week1;
import java.util.*;
public class discount {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the quantity");
		int quant=sc.nextInt();
		int purchase=quant*100;
		
		if(quant>10) {
			int disc=purchase/10;
			purchase-=disc;
			System.out.println("congrats you have a discount "+purchase);
		}else{
			System.out.println(purchase);
		}
	}
}

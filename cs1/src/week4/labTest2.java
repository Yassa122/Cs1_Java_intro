package week4;
import java.util.*;
public class labTest2 {
    public static String decToBin(int n) {
        if(n==1) {
            return "1";
        }else if(n==0) {
            return "0";
        }else {
            return decToBin(n/2) + n % 2;
        }
    }
    public static void main(String[] args) {
    	Scanner sc=new Scanner(System.in);
    	System.out.println("enter a number");
        int x = sc.nextInt();
        System.out.println(decToBin(x));
    }
}

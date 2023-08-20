package week2;
import java.util.*;
public class caesarCipher {
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	
	System.out.println("Enter the message");
	String msg=sc.nextLine();
	
	System.out.println("Enter the key");
	int key=sc.nextInt();
	
	int asci=0;
	char x;
	for (int i = 0; i < msg.length(); i++) {
		asci=msg.charAt(i)+key;
		x=(char)asci;
		System.out.print(x);

	}
	}
}

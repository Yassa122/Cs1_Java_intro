package week1;
import java.util.*;
public class Zodiac {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter your zodiac sign to display your month range");
		String sign=sc.nextLine();
		
		switch(sign) {
		case"Aries":
			System.out.println(": March 21 till April 19");break;
		case"Taurus":
			System.out.println(": April 20 till May 20");break;	
		case"Gemini":
			System.out.println(": May 21 till June 21");break;
		case"Cancer":
			System.out.println(": June 22 till July 22");break;	
		case"Leo":
			System.out.println(": July 23 till August 22");break;
		case"Virgo":
			System.out.println(": August 23 till September 22");break;	
		case"Libra":
			System.out.println(": September 23 till October 23");break;
		case"Scorpius":
			System.out.println(": October 24 till November 21");break;
		case"Sagittarius":
			System.out.println(":  November 22 till December 21");break;
		case"Capricornus":
			System.out.println(":  December 22 till January 19");break;
		case"Aquarius":
			System.out.println(":  January 20 till February 18");break;
		case"Pisces":
			System.out.println(":  February 19 till March 20");break;
		}
	}
}

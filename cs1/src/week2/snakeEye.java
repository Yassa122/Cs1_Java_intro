package week2;
import java.util.*;
public class snakeEye {

	
	public static void main(String[] args) {
	int die1, die2;	
	int countRolls;
	countRolls=0;
	do {
		die1 =(int)(Math.random()*6)+1;
		die2 =(int)(Math.random()*6)+1;
		countRolls++;
		
	} while (die1!=1||die2!=1);
	
		System.out.println("countRolls");
	}
}

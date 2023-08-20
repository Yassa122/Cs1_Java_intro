package week4;

public class pairOfDice {
	int die1;
	int die2;
	
	public  void roll() {
		die1=(int)(Math.random()*6)+1;
		die2=(int)(Math.random()*6)+1;
	}
	public pairOfDice() {
		roll();
	}
	public int getFirstDie() {
		return die1;
	}
	public int getSeconfDie() {
		return die2;
	}
	public int getTotal() {
		return die1+die2;
	}
	public static void main(String[] args) {
		pairOfDice p1=new pairOfDice();
		while (p1.getTotal()!= 2) {
			p1.roll();
		
		System.out.println(p1.getFirstDie()+""+p1.getSeconfDie());
		}
	}
}

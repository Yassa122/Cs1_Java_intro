package week3;
import java.util.Random;

public class dice {

     int firstDice;
     int secondDice;
      Random rand = new Random();

    public dice () {
        roll();
    }

    public void roll() {
        firstDice = rand.nextInt(6) + 1;
        secondDice = rand.nextInt(6) + 1;
    }

    public int getFirstDice() {
        return firstDice;
    }

    public int getSecondDice() {
        return secondDice;
    }

    public int getTotal() {
        return firstDice + secondDice;
    }

    public static void main(String[] args) {
        dice dice = new dice();
        int countRolls = 0;

        
        
        do {
            dice.roll();
            countRolls++;
            System.out.println("Roll " + countRolls + ": " + dice.getFirstDice() + " " + dice.getSecondDice());
        } while (dice.getTotal() != 2);

        System.out.println("It took " + countRolls + " rolls to get snake eyes.");
    }
}

package week1;

import java.util.Scanner;

public class supermarket {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int quarters, dimes, nickels, pennies;

        System.out.println("Enter number of quarters: ");
        quarters = sc.nextInt();

        System.out.println("Enter number of dimes: ");
        dimes = sc.nextInt();

        System.out.println("Enter number of nickels: ");
        nickels = sc.nextInt();

        System.out.println("Enter number of pennies: ");
        pennies = sc.nextInt();

        double total = quarters * 25 + dimes * 10 + nickels * 5 + pennies;
        System.out.println("Total is: $" + total / 100);
    }
}

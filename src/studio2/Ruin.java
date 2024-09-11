package studio2;

import java.util.Scanner;

public class Ruin {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the start amount: ");
		int startAmount = in.nextInt();
		System.out.println("Enter the probability of winning: ");
		double winChance = in.nextDouble();
		System.out.println("Enter your win limit (the amount of money that, if you reach, you will leave): ");
		double winLimit = in.nextDouble();
		System.out.println("Enter the number of simulations (number of days ur playing): ");
		int NumSimulations = in.nextInt();
		
		int totlosses = 0;
		int totwins = 0;
		
		for (int i = 0; i < NumSimulations; i++) {
			int balance = startAmount;
			int numplays = 0;
			
		
		while (balance > 0 && balance < winLimit) {
		numplays = numplays + 1;
		
			if (Math.random() < winChance) {
			balance = balance + 1;
			totwins = totwins + 1;
			} else {
			balance = balance - 1;
		}
			if (balance == 0) {
				totlosses = totlosses + 1;
			}

	}
		}
		System.out.println("Losses: " + totlosses + " Simulations: " + NumSimulations);
}
	}

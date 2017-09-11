package exercises;

import java.util.Scanner;

public class Eggs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Cost
		Scanner input = new Scanner(System.in);
		int EggsInDozen = 12;
		double EggCost = 0.45;
		double DozenCost = 3.25;
		int Eggs;
		double Total;
		System.out.println("Enter number of eggs >>> ");
		Eggs = input.nextInt();
		System.out.println("");
		
		int Dozen = Eggs / EggsInDozen;
		int ExtraEggs;
		
		
		ExtraEggs = Eggs % Dozen;
		Total = (Dozen * DozenCost) + (ExtraEggs * EggCost);
		System.out.println("You ordered " + Eggs + " eggs." + " That's " + Dozen + " at 3.25 per dozen and " + ExtraEggs +
				" at 45 cents each for a total of " + Total); 
	}

}

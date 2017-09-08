package exercises;

import java.util.Scanner;

public class Eggs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Cost
		double Egg = .045;
		double DozenEggs = 3.25;
		
		int Eggs;
		int Dozen = 12;
		int ExtraEggs;
		double Total;
		Scanner input = new Scanner(System.in);
		
		Dozen = Eggs % 12;
		
		
		System.out.println("Enter number of eggs");
		Eggs = input.nextInt();
		System.out.println("")
		
		
		
		
		
		
		
		
		System.out.println("You ordered" + Eggs + "eggs." + " That's" + Dozen + "at 3.25 per dozen and" + ExtraEggs +
				" at 45 cents each for a total of");
	}

}

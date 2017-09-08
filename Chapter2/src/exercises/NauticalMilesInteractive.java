package exercises;

import java.util.Scanner;

public class NauticalMilesInteractive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double kilometersInNauticalMile = 1.852;
		double milesInNauticalMile = 1.150779;
		
		int nauticalMiles = 5;
		double kilometersNeeded;
		double milesNeeded;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter number of nautical miles");
		nauticalMiles = input.nextInt();
		
		
		
		kilometersNeeded = kilometersInNauticalMile * nauticalMiles;
		milesNeeded = milesInNauticalMile * nauticalMiles;
		
		System.out.println("You have " + nauticalMiles + " Nautical Miles which equals " + milesNeeded + " miles and " +
		kilometersNeeded + "kilometers");
		
		
		
		
		
		
		
		
		
	}

}

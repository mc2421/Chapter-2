package exercises;

import java.util.Scanner;

public class InchesTofeet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int InchesInFoot = 12;
		
		int Inches = 25;
		int Feet;
		int ExtraInches;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter number of Inches");
		Inches = input.nextInt();
		ExtraInches = Inches % InchesInFoot;
		
		Feet = Inches / InchesInFoot;
		
		System.out.println("You have " + Inches + " inches which equals " + Feet + " feet and " + ExtraInches + " inches");;
		
	}

}

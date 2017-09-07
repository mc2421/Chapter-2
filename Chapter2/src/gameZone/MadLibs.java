package gameZone;

import java.util.Scanner;

public class MadLibs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String color; 
		String wordEst;
		String bodyPartPlural;
		String anAnimal;
		String aNoun;
		String PluralNoun;
		
		int integera;
		int integerb;
		int integerc;
		

		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a color >>");
		color = input.nextLine();
		System.out.print("Enter a wordEst >>");
		wordEst = input.nextLine();
		System.out.print("Enter a bodyPartPlural >>");
		bodyPartPlural = input.nextLine();
		System.out.print("Enter an Animal >>");
		anAnimal = input.nextLine();
		System.out.print("Enter aNoun");
		aNoun = input.nextLine();
		System.out.print("Enter a PluralNoun >>");
		PluralNoun = input.nextLine();
		System.out.print("Enter a number >> ");
		integera = input.nextInt();
		System.out.print("Enter a number >>");
		integerb = input.nextInt();
		System.out.print("A - B = C)");
		integerc = integera-integerb;
		
		
		
		
		System.out.println("The color is " + color);
		System.out.println("The wordEst is " + wordEst);
		System.out.println("The bodyPartPlural is " + bodyPartPlural);
		System.out.println("The Animal is " + anAnimal);
		System.out.println("The Noun is " + aNoun);
		System.out.println("");
		
		
		
		System.out.print("The " + color + " Dragon is the " + wordEst + " Dragon of all. It has " + integerc + bodyPartPlural + ", and a " + anAnimal + "shaped like a " + aNoun + 
				". It loves to eat" + PluralNoun + ", although it will feast on nearly anything"); 
		
		
		

	}

}

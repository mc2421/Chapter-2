package youDoIt;

import java.util.Scanner;

public class ArithmeticDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		double firstNumber;
		double secondNumber;
		double sum;
		double difference;
		double average;
		
		System.out.print("Please enter a double >> ");
		firstNumber = input.nextDouble();
		System.out.print("Please enter another double >>");
		secondNumber = input.nextDouble();
		
		sum = firstNumber + secondNumber;
		difference = firstNumber - secondNumber;
		average = sum / 2;
		
		System.out.println(firstNumber + " + " +
				secondNumber + " is " + sum);
		System.out.println(firstNumber + " - " + 
				secondNumber + " is " + difference);
		System.out.println("The average of " + firstNumber + 
				" and " + secondNumber + " is " + average);
		
	}

}

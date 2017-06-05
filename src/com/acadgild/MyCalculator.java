package com.acadgild;

import java.util.Scanner;
/**
 * 
 * @author Deepak
 * Main class to perform Calculator operations
 */
public class MyCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//instantiate calculator class object
		Calculator calc = new ScientificCalculator();

		//scanner class object to accept input
		Scanner s = new Scanner(System.in);

		//Accept first number
		System.out.print("Enter first Number ::");
		int firstNo = s.nextInt();

		//Accept second number
		System.out.print("Enter second Number ::");
		int secondNo = s.nextInt();

		//Accept operation name
		System.out.println("Enter Operation to Perform:: ");
		System.out.println("\tA - Addition");
		System.out.println("\tS - Subtraction");
		System.out.println("\tM - Multiply");
		System.out.println("\tD - Divide");
		System.out.println("\tX - Mod");
		System.out.println("\tY - Power");
		char operName = s.next().charAt(0);

		//Set the first number, second number and operation name
		//data members of class Calculator
		calc.setFirstNumber(firstNo);
		calc.setSecondNumber(secondNo);
		calc.setOperationName(operName);

		//Perform calculation
		calc.result = calc.Calculate();

		//Display the result
		System.out.println("Result = " + calc.result);

		s.close();
	}

}

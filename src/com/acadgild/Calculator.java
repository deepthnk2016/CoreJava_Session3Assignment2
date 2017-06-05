package com.acadgild;

/**	Parent Class - Basic Calucator
	Have four functions - Addition, Subtraction, Multiplication and Division
	------------------------------------------------------------------------
	Method		 -	 Calculate () - Performs the operaton on the data members
	Data Members -	 Operands - first number and second number
	 				 Result	  - to store the result of the operation
	 				 OperationName - which operation to perform
	------------------------------------------------------------------------
*/
public class Calculator {
	
	//Data Members Declaration
	private int firstNumber;
	private int secondNumber;
	int result;
	char operationName;

	//Constructor to set the default operation to Addition
	public Calculator() {
		this.operationName = 'A';
	}

	//Setters and Getters for the Data Members -- Start
	public int getFirstNumber() {
		return firstNumber;
	}

	public void setFirstNumber(int firstNumber) {
		this.firstNumber = firstNumber;
	}

	public int getSecondNumber() {
		return secondNumber;
	}

	public void setSecondNumber(int secondNumber) {
		this.secondNumber = secondNumber;
	}

	public char getOperationName() {
		return operationName;
	}

	public void setOperationName(char operationName) {
		this.operationName = operationName;
	}
	//Setters and Getters for the Data Members -- End
	
	//Calculate Method	-	Evaluate operation name and perform the operation
	//use this keyword to refer to data members
	public int Calculate() {

		switch (this.operationName) {
		case 'A':
			result = this.firstNumber + this.secondNumber;
			break;

		case 'S':
			result = this.firstNumber - this.secondNumber;
			break;

		case 'M':
			result = this.firstNumber * this.secondNumber;
			break;

		case 'D':
			result = this.firstNumber / this.secondNumber;
			break;
		}
		return result;
	}
}

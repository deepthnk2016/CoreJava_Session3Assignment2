package com.acadgild;

/**
 * 
 * Child class extending Parent Class (Calculator) It has two additional methods
 * - i. To calculate mod ii. To calculate power
 * 
 */
public class ScientificCalculator extends Calculator {

	// child class constructor to call parent class constructor
	public ScientificCalculator() {
		super();
	}

	// Calculate method to calculate the new opeartions
	public int Calculate() {

		switch (this.getOperationName()) {
		// Calculate mod
		case 'X':

			result = this.getFirstNumber() % this.getSecondNumber();
			break;
		// Calculate power
		case 'Y':
			Double rslt = Math.pow(this.getFirstNumber(),
					this.getSecondNumber());
			result = Integer.valueOf(rslt.intValue());
			break;
		// In case of anything else call parent class method
		default:
			result = super.Calculate();
			break;
		}
		return result;
	}
}

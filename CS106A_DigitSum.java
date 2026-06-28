/**
 * File: CS106A_DigitSum.java
 * ----------------------------
 * This Java program sums the digits in a positive integer.
 * The program depends on the fact that the last digit of 
 * an integer n is given by n % 10 and the number consisting
 * of all but the last digit is given by the expression n / 10.
 */

import acm.program.*;

public class CS106A_DigitSum extends ConsoleProgram
{	
	public void run()
	{ 
		getIntegerFromUser();
	}
	
	
	private void introduceApp()
	{
		println("This program sums the digits in an integer.");
	}
	
	
	private void getIntegerFromUser()
	{
		int userInt = readInt("enter a positive integer you'd like to sum: ");
		sumDigits(userInt);
	}
	
	
	private void sumDigits(int userInput)
	{
		int dSum = 0;
		while (userInput > 0){
			//book does this in 2 lines, I did it in 3 (womp womp)
			int tmpLastDigit = userInput % 10;
			userInput /= 10;
			dSum += tmpLastDigit;
		}	
		
		println("total = " + dSum);
	}
}
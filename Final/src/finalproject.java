// Albe Alberici
// Date: May 4th 2020
// Final Project

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class finalproject {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		// Start Scanner
		Scanner keyboard = new Scanner (System.in);
		
		// Declare Variables
				int firstNumber;
				int secondNumber;
				int thirdNumber;
				int fourthNumber;
				int choice;
				int secret = 0;
		
		// Open input file from desktop
		File filename = new File("/Users/albae/Desktop/finalproject.txt");
		Scanner inputFile = new Scanner(filename);
		
		// Loop through the file
		while (inputFile.hasNext())
		{
			// Read data
			int fileNumbers = inputFile.nextInt();
			fileNumbers = secret;
		}	
	
		// Collect first user input
		// use while loop to check if user picks a number between 1 and 10
 		System.out.print("Enter a number 1 through 10: ");
 		firstNumber = keyboard.nextInt();
 		// Validate the input 
 		while (firstNumber < 1 || firstNumber > 10)
 		{
 			System.out.println("That number is invalid.");
 			System.out.print("Enter a number in between of 1 through 10: ");
 			firstNumber = keyboard.nextInt();
 		}
 		
 		System.out.print("Enter a second number 1 through 10: ");
 		secondNumber = keyboard.nextInt();
 		
 		// Validate the input 
 		while (secondNumber < 1 || secondNumber > 10)
 		{
 			System.out.println("That number is invalid.");
 			System.out.print("Enter a second number 1 through 10: ");
 			secondNumber = keyboard.nextInt();
 		}
 		System.out.print("Enter a third number 1 through 10: ");
 		thirdNumber = keyboard.nextInt();
 		
 		// Validate the input 
 		while (thirdNumber < 1 || thirdNumber > 10)
 		{
 			System.out.println("That number is invalid.");
 			System.out.print("Enter a third number 1 through 10: ");
 			thirdNumber = keyboard.nextInt();
 		}
 		System.out.print("Enter a fourth number 1 through 10: ");
 		fourthNumber = keyboard.nextInt();
 		
 		// Validate the input 
 		while (fourthNumber < 1 || fourthNumber > 10)
 		{
 			System.out.println("That number is invalid.");
 			System.out.print("Enter a fourth number 1 through 10: ");
 			fourthNumber = keyboard.nextInt();
 		}
 		
 	// Display menu and gain user input
		System.out.println("Main Menu");
		System.out.println("_________\n");
		System.out.println("\t1.) Add");
		System.out.println("\t2.) Subtract");
		System.out.println("\t3.) Multiply");
		System.out.println("\t4.) Divide");
		System.out.println("\t5.) Exit \n");
		System.out.print("Please choose (1-5): ");
		choice = keyboard.nextInt();
	
 	// Output content based upon user input
		switch (choice) 
		{
		case 1:
			System.out.print("Your first two numbers added together are: " );
			System.out.println(firstNumber + secondNumber);
			if (firstNumber + secondNumber == secret)
					System.out.println("You found the secret number");
			break;
		case 2:
			System.out.print("Your first two numbers subtracted are: ");
			System.out.println(firstNumber - secondNumber);
			if (firstNumber - secondNumber == secret)
				System.out.println("You found the secret number");
			break;
		case 3:
			System.out.print("Your first two numbers multiplied are: ");
			System.out.println(firstNumber * secondNumber);
			if (firstNumber * secondNumber == secret)
				System.out.println("You found the secret number");
			break;
		case 4:
			System.out.print("Your first two numbers divided are: ");
			System.out.println(firstNumber / secondNumber);
			if (firstNumber / secondNumber == secret)
				System.out.println("You found the secret number");
			break;
		case 5:
			System.out.println("See you later!");
			break;
		default:
			System.out.println("You made an invalid choice. ");
			
			//create the array
			int[][] scores = new int[2] [2];	//2 col  2  rows

			//loop one: loop thru rows first
			for (int row = 0; row<scores[0].length; row++)
			{
				for (int col = 0; col<scores.length; col++)
				{
					if(col== 0)
					{
						scores[col][row] = thirdNumber;
					}

					//random info for team two
					if(col== 1)
					{
						scores[col][row] = fourthNumber;
					
					}
				} //end of loop two
			} //end of loop one
				
		// Close files
		inputFile.close();	
		}
	}

}
	

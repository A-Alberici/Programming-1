// Author: Albe Alberici
// Project 3 revised edition
// Febuary 27, 2019

import java.util.Scanner;

public class project3revised {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Start Scanner
		Scanner keyboard = new Scanner (System.in);
		
		// Declare Variables
				String firstName;
				String lastName;
				int userNumber;
		// Collect user input
 		System.out.print("What is your first name? ");
 		firstName = keyboard.next();
 		System.out.print("What is your last name? ");
 		lastName = keyboard.next();

 		// use while loop to check if user picks a number between 1 and 100
	 		System.out.print("Enter a number inbetween 1 through 100: ");
	 		userNumber = keyboard.nextInt();
	 		// Validate the input 
	 		while (userNumber < 1 || userNumber > 100)
	 		{
	 			System.out.println("That number is invalid.");
	 			System.out.print("Enter a number in between of 1 through 100: ");
	 			userNumber = keyboard.nextInt();
	 		}
 		for(int numberCountdown = userNumber; numberCountdown >=0; numberCountdown--)
		{
				System.out.println("Thank you " + firstName + " " + lastName + ", \nyour number is now " + numberCountdown + ".");
				// inform user of the countdown
		}
 			
 	// Close the keyboard
 		keyboard.close();	
	}

}
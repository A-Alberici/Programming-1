// Project 2
// Author: Albe Alberici


import java.util.Scanner;

public class project2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Start Scanner
 		Scanner keyboard = new Scanner (System.in);
		
		// Declare Variables
 		int firstNumber ;
 		int secondNumber;
 		int thirdNumber;
 		int choose;
 		
 		// Ask user for numbers
 				System.out.print("What is your first number? ");
 				firstNumber = keyboard.nextInt();
 				
 				System.out.print("What is your second number? ");
 				secondNumber = keyboard.nextInt();
 				
 				System.out.print("What is your third number? ");
 				thirdNumber = keyboard.nextInt();
		
		// Display menu and gain user input
				System.out.println("Main Menu");
				System.out.println("_________\n");
				System.out.println("\t1.) Add");
				System.out.println("\t2.) Subtract");
				System.out.println("\t3.) Multiply");
				System.out.println("\t4.) Divide");
				System.out.println("\t5.) Exit \n");
				System.out.print("Please choose (1-5): ");
				choose = keyboard.nextInt();
			
				// Output content based upon user input
				switch (choose) 
				{
				case 1:
					System.out.print("Your first two numbers added together are: " );
					System.out.println(firstNumber + secondNumber);
					break;
				case 2:
					System.out.print("Your first two numbers subtracted are: ");
					System.out.println(firstNumber - secondNumber);
					break;
				case 3:
					System.out.print("Your first two numbers multiplied are: ");
					System.out.println(firstNumber * secondNumber);
					break;
				case 4:
					System.out.print("Your first two numbers divided are: ");
					System.out.println(firstNumber / secondNumber);
					break;
				case 5:
					System.out.println("See you later!");
					break;
				default:
					System.out.println("You made an invalid choice.  Sorry. :-/");
		// Different cases for responses
				}

				if (thirdNumber >= (firstNumber + secondNumber) ) 
				{
					System.out.println("Your total is less than your third number.");
				} else
				{
					System.out.println("Your total is bigger than the third number.");
					System.out.println("That's a big number.");
				}
					//for measuring total
 		// Close the keyboard
 		keyboard.close();



	}
	}

// program 6
// Alberici
// April 2


//import additional code being used
import java.util.Scanner;
import java.util.Random;

public class program6 {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		Random randomNumber = new Random();
		int teamOneTotal = 0;
		int teamTwoTotal = 0;
		String teamOne = "Seton Hill:\t";
		String teamTwo = "Slippery Rock:\t";

		//Announce the game
		System.out.println("Welcome to Boujee-Ball!");
		System.out.println("=======================");
		System.out.println("Similar to Capture-The-Flag, the goal of the game is to maintain possession of the ball at the neutral location. Obtain the ball by any means neccssary.");
		System.out.println("The team with the longest time of possession at the end of all the periods is the winner!");
		//prompt user for # number of sections and create array
		System.out.println("How many periods do you want to play?");
		int sections = keyboard.nextInt();

		//create the array
		int[][] scores = new int[2] [sections];	//2 coll  X# of rows

		//loop one: loop thru rows first
		for (int row = 0; row<scores[0].length; row++)
		{
			for (int col = 0; col<scores.length; col++)
			{
				//random info for team one
				if(col== 0)
				{
					//random
					scores[col][row] = randomNumber.nextInt(100);
					//total
					teamOneTotal += scores[col][row];
					//add to our string
					teamOne = teamOne + scores[col][row] + "\t";
				}

				//random info for team two
				if(col== 1)
				{
					//random
					scores[col][row] = randomNumber.nextInt(100);
					//total
					teamTwoTotal += scores[col][row];
					//add to our string
					teamTwo = teamTwo + scores[col][row] + "\t";
				}
			} //end of loop two
		} //end of loop one
	
		//output total scores
		System.out.println(teamOne + "=\t" + teamOneTotal);
		System.out.println(teamTwo + "=\t" + teamTwoTotal);
		
		if (teamOneTotal == teamTwoTotal)
		{
			System.out.println("There was a tie!");
		}	
		else
		{
			if (teamOneTotal > teamTwoTotal)
			{
				System.out.println("Seton Hill is the winner!");
			}
			else
			{
				System.out.println("Slippery Rock is the winner!");
			}
		}
	}	

}

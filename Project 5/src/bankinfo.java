//Albe Alberici
//Mar 24
//Project 5

import java.util.Scanner;

public class bankinfo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//declare variables
		Scanner keyboard = new Scanner (System.in);
		double deposit = 0;
		double withdraw = 0;
		
		//create checking or bank account
		BankAccount checking = new BankAccount();
								//this creates checking.name or checking.accountNumber
		checking.name = "Albe's Primary checking";
		checking.accountNumber = 4220;
		checking.type = 'C';
		
		//create a savings account
		BankAccount savings = new BankAccount();
		savings.type = 'S';
		
		//set the initial balance
		//checking.balance = 200	CANNOT do this cuz its private
		checking.addDeposit(200);
		System.out.println("Your starting balance is: $" + checking.getBalance());
		
		//make deposit
		System.out.print("How much would you like to deposit?");
		deposit = keyboard.nextDouble();
		checking.addDeposit(deposit);
		
		//make withdraw
		System.out.print("How much would you like to withdraw?");
		withdraw = keyboard.nextDouble();
		checking.subtractWithdraw(withdraw);
		
		//transfer funds from checking to savings
		checking.subtractWithdraw(50.00);
		savings.addDeposit(50.00);
		
		//calculate interest 
		checking.calcInterest();
		savings.calcInterest();
		
		//check balance
		System.out.println("Your final checking balance is: $" + checking.getBalance());
		System.out.println("Your final savings balance is: $" + savings.getBalance());
		
	}

}

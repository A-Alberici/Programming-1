//class name: bank account


public class BankAccount {
//declare variables
	public String name;
	public double balance;
	public char type;
	public double interestRate;
	public int accountNumber;
	
//build constructer note: constructer name is same as class name
//constructer is optional = test question
	public BankAccount()
	//set initial balance
	{
		balance = 0;
		interestRate = .02;			// Set interest to 2%
	}
	
	//deposit funds
	public void addDeposit(double dep)
	{
		balance = balance + dep;
	}
	//withdraw funds
	public void subtractWithdraw(double wit)
	{
		if (balance < wit)
		{
			System.out.println("You do not have enough funds to withdrawal that amount.");
		}
		else
		{
			balance = balance - wit;
		}
	}
//check balance
	public double getBalance()
	{
		return balance;
	}
	//calculate interest
	public void calcInterest()
	{
	//only calculate interest for I or S type acc
		if (type == 'S' || type == 'I')
		{
			double interestAmount;
			interestAmount = balance * interestRate;
			balance += interestAmount;
		}
	}
}


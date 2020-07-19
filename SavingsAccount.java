import java.util.Scanner;

public class SavingsAccount {
	double balance;
	int interestRate;
	int accountNo;
	double newbalance;
	
	public  SavingsAccount()
	{
		balance=0000.0;
		interestRate=0;
		accountNo=0000;
	}
	
	public SavingsAccount(double balance,int interestRate ,int accountNo)
	{
		this.balance=balance;
		this.interestRate=interestRate;
		this.accountNo=accountNo;
		
	}
	
	public double getbalance()
	{
		return balance;
	}
	
	public int getinterestRate()
	{
		return interestRate;
	}
	
	public int getaccountnNo()
	{
		return accountNo;
		
	}
	
	public void withDraw(double amount)
	{
		
		System.out.println("enter the amount");
		Scanner sc=new Scanner(System.in);
		amount=sc.nextDouble();
		
		if(amount > balance)
		{
			System.out.println("you have less balance than amount entered");
		}
		else
		{
			double debit=balance-amount;
			newbalance=debit;
			System.out.println("Successfully withdrawn "+amount);
		}
		
	}
	
	void calculateInterest()
	{
		
		
		double interest=(newbalance*interestRate)/100;
		System.out.println("the calculated interest is "+interest);
	}
	
	public static void main(String[] args)
	{
		double b1 = 0.0;
		SavingsAccount sa=new SavingsAccount(1234.4, 5, 15000);
		System.out.println(sa.getaccountnNo()+" "+sa.getbalance()+" "+sa.getinterestRate());
		sa.withDraw(b1);
		sa.calculateInterest();
		
	}

}

package Bank.Application;

public class acc{
	
	
	long credit(long balance,long credit)
	{
		balance += credit;

		return balance;
	}
	long debit(long balance,long d)
	{
		
			balance=balance-d;
			return balance;
	}
	void balance(long balance)
	{
		System.out.println("Your balance is "+balance);
	}
	
}
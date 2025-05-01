package Bank.Application;

import java.util.Scanner;



public class ATM{
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		String fname,lname;
		long mnumber,acc_no,acc_balance;
		acc a1=new acc();
		Personal_Info P1=new Personal_Info();
		//Personal Info 
		System.out.println(" 			Welcome to 1Rivet Bank");
		System.out.println("Please Create a new Account ");
		System.out.println("Enter First Name :");
		fname=scan.nextLine();
		System.out.println("Enter last Name  :");
		lname=scan.nextLine();
		System.out.println("Enter mobile No  :");
		mnumber=scan.nextLong();
		System.out.println("Enter account No :");
		acc_no=scan.nextLong();
		System.out.println("Enter your Amount:");
		acc_balance=scan.nextLong();
		//calling Personal_info class object
		P1.Personal_Info(fname,lname,mnumber,acc_no,acc_balance);	
		System.out.println();
		
		//Banking operation
		
		System.out.println("Enter number of your choice from below : ");
		System.out.println();
		System.out.println("1.Deposit \n2.Withdraw \n3.Balance \n4.Exit");
		int c=scan.nextInt();
		if(c==4)
			System.exit(0);
		while(!(c==4))
		{
		
		if(c==1)
		{
			System.out.println("Enter the amount you want to Deposit : ");
		    int credit=scan.nextInt();
			acc_balance=a1.credit(acc_balance,credit);
			System.out.println("Account credited with "+(credit));
			System.out.println("Account balance ="+(acc_balance));
		}
		else if(c==2)
		{
			System.out.println("Enter the amount you want to Withdraw  : ");
		    int debit=scan.nextInt();
		    if(acc_balance>debit)
		    {
		    acc_balance=a1.debit(acc_balance,debit);
			System.out.println("Account debited with "+(debit));
			System.out.println("Account balance ="+(acc_balance));
		    }
		    else
		    	System.out.println("Error");
		}
		else if(c==3)
		{
			a1.balance(acc_balance);
		}
		else if(c==4)
		{
			System.exit(0);
		}
		else
			System.out.println("Enter number between 1 to 4");
		
		System.out.println("1.Deposit \n2.Withdraw \n3.Balance \n4.Exit");
		 c=scan.nextInt();
		}
		
		
		
	}
}


package Inheritance;

class Account
{
	
	 int accountNumber;
	 String name;
	
	public void acceptDetails(int acn,String n) 
	{
		this.accountNumber=acn;
		this.name=n;
	}
	
	public void Display() 
	{
		System.out.println("parent Account ");
		System.out.println("Account Number is "+accountNumber);
		System.out.println("Name  is "+name);
	}
	
}

class SavingAccount extends Account
{
	int intRate;

	public void acceptSavingDetails(int acn,String n,int r) 
	{
		this.intRate=r;
		this.accountNumber=acn;
		this.name=n;
	}
	public void displaySaving() 
	{
		System.out.println("Saving Account ");
		System.out.println("Account Number is "+accountNumber);
		System.out.println("Name  is "+name);
		System.out.println("Interest rate is "+intRate);
	}

}

class FdAccount extends Account 
{
	
	int intRate;

	public void acceptFdDetails(int acn,String n,int r) 
	{
		this.intRate=r;
		this.accountNumber=acn;
		this.name=n;
	}
	public void displayFd() 
	{
		System.out.println(" Fd Account ");
		System.out.println("Account Number is "+accountNumber);
		System.out.println("Name  is "+name);
		System.out.println("Interest rate is "+intRate);
			
	}
}

class RecAccount extends Account 
{
	
	int intRate;

	public void acceptRecDetails(int acn,String n,int r) 
	{
		this.intRate=r;
		this.accountNumber=acn;
		this.name=n;
	}
	public void displayRec() 
	{
		System.out.println(" Recurring  Account ");
		System.out.println("Account Number is "+accountNumber);
		System.out.println("Name  is "+name);
		System.out.println("Interest rate is "+intRate);
			
	}
}

public class HierarchicalInheritanceMain {

	public static void main(String[] args) {
		SavingAccount sa= new SavingAccount();
		sa.acceptSavingDetails(1223, "Nagesh", 5);
		sa.displaySaving();
		
		FdAccount fd = new FdAccount();
		fd.acceptFdDetails(554433, "Kiran", 6);
		fd.displayFd();
		
		RecAccount ra=new RecAccount();
		ra.acceptRecDetails(12789, "Vicky", 4);
		ra.displayRec();
		
	}
}

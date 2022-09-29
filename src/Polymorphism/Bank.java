package Polymorphism;

public class Bank {
	
	static int count=0;
	
	public void accessAccount(FdAccount f ) 
	{
		count++;
		System.out.println("\n This is F.D Account : \n");
		f.showAccStatus();
		f.changeIr(10f);
	}

	public void accessAccount(SavingAccount s ) 
	{
		count++;
		System.out.println("\n This is Saving Account \n");
		s.showAccStatus();
		s.changeIr(8f);
	}
	public void accessAccount(RecurAccount r ) 
	{
		count++;
		System.out.println("\n This is Reccuring Account \n");
		r.showAccStatus();
		r.changeIr(9f);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Bank b= new Bank();
		
		FdAccount f = new FdAccount(500000.0f,"Nagesh");
		b.accessAccount(f);
		
		FdAccount f1 = new FdAccount(600000.0f,"Vivek");
		b.accessAccount(f1);
		
		System.out.println("Number of Fd Bank Account opened : "+FdAccount.count);
		
		
		SavingAccount s = new SavingAccount(700000.0f,"Viraj");
		b.accessAccount(s);
		
		SavingAccount s1 = new SavingAccount(800000.0f,"Vinit");
		b.accessAccount(s1);
		
		System.out.println("Number of Saving Bank Account opened : "+SavingAccount.count);
		
		RecurAccount r = new RecurAccount(900000.0f,"Kiran");
		b.accessAccount(r);
		
		RecurAccount r1 = new RecurAccount(200000.0f,"Vicky");
		b.accessAccount(r1);
		
		System.out.println("Number of Reccuring Bank Account opened : "+RecurAccount.count);
		
		System.out.println("\nNumber of Total Bank Account opened : "+Bank.count);
		

	}

}

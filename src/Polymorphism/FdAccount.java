package Polymorphism;

public class FdAccount{
	long acNo;
	float balance;
	String accHolderName;
	static float intRate;
	static long cnt=123445678L;
	static int count=0;
	
	public FdAccount() 
	{
		count++;
		System.out.println("Default Constructor : ");
		acNo=cnt++;
		balance=5000f;
		accHolderName="AAA";
	}
	
	public FdAccount(float bal,String accH) 
	{
		count++;
		acNo=cnt++;
		balance=bal;
		accHolderName=accH;
	}
	
	public void showAccStatus() 
	{
		System.out.println("Account number is : "+acNo);
		System.out.println("Account Balance is : "+balance);
		System.out.println("Account Holder name  is : "+accHolderName);
		
		
	}
	
	public void changeIr(float ir) 
	{
		intRate=ir;
		System.out.println("Interest rate  is : "+FdAccount.intRate);
	}
}

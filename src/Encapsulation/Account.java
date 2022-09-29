package Encapsulation;

public class Account {
	
	private int id;
	private double balance;
	private String name;
	
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public double getBalance() {
		return balance;
	}


	public void setBalance(double balance) {
		this.balance = balance;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public Account() 
	{
		//System.out.println("This is Default constructor : ");
		
		this.id = 0;
		this.balance = 0;
		this.name ="null";
	}
	
	
	public Account(int id, double balance, String name) {
		
		this.id = id;
		this.balance = balance;
		this.name = name;
	}


	public void showDetails() 
	{
		System.out.println("Id is : "+id);
		System.out.println("Balance is : "+balance);
		System.out.println("Name is : "+name);
	
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Account a  = new Account(1,2000,"Nagesh");
		a.showDetails();
		
		
		Account a1  = new Account(2,3000,"Kiran");
		a1.showDetails();
		
		Account a2  = new Account();
		a2.showDetails();
		
		

	}

}

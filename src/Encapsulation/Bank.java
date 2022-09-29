package Encapsulation;

public class Bank {
	
	public void showDetails(Account a) 
	{
		System.out.println("ID is : "+a.getId());
		System.out.println("Name is : "+a.getName());
		System.out.println("Balance is : "+a.getBalance());
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Account a =  new Account();
		a.setId(1);
		a.setName("Nagesh");
		a.setBalance(20000);
		
		Bank b = new Bank();
		b.showDetails(a);

	}

}

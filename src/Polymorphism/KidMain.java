package Polymorphism;

class kid
{
	public void readBook() 
	{
		System.out.println("This is Kid Class ");
		
	}
	
	public void readBook(String bookName,String authorName) 
	{
		System.out.println("This is Kid Class ");
		System.out.println("Book name is "+bookName);
		System.out.println("Author Name is "+authorName);
	}
}

class BigKid extends kid
{
	public void readBook(String bookName,String authorName) 
	{
		System.out.println("This is BigKid Class ");
		System.out.println("Book name is "+bookName);
		System.out.println("Author Name is "+authorName);
	}
}

class Teenager extends kid
{
	public void readBook(String bookName,String authorName) 
	{
		System.out.println("This is Teenager Class ");
		System.out.println("Book name is "+bookName);
		System.out.println("Author Name is "+authorName);
	}
}

public class KidMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		kid k1,k2 ;
		
		BigKid b = new BigKid();
		b.readBook("ABC","ABC");
		
		Teenager t =  new Teenager();
		
		
	}

}

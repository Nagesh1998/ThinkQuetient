package Inheritance;

interface IceCream 
{
	public void eat(); 
}

interface Juice 
{
	public void drink(); 
}

class Mastani implements IceCream,Juice
{
	public void eat() 
	{
		System.out.println("We can eat....");
	}
	public void drink() 
	{
		System.out.println("We can Drink....");
	
	} 
}

class MastaniMain
{
	public static void main(String []args)
	{
		Mastani m = new Mastani();
		m.drink();
		m.eat();
	}
}

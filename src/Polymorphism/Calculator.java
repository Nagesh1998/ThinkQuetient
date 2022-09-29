package Polymorphism;

public class Calculator {
	
	public void printOnNumber(int number1,int number2) 
	{
		System.out.println("Addition is : "+(number1+number2));
	}
	
	public void printOnNumber(float number1,float number2) 
	{
		System.out.println("Subtraction is : "+(number1-number2));
	}
	
	public void printOnNumber(double number1,double number2) 
	{
		System.out.println("Multiplicatin  is : "+(number1*number2));
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Calculator s = new Calculator();
		s.printOnNumber(2, 2);
		s.printOnNumber(4.5f, 2.5f);
		s.printOnNumber(2.0, 2.0);
	}

}

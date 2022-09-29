package Inheritance;

class Animal1
{
	void eat() 
	{
		System.out.println("Eating ......");
	}
}

class Dog1 extends Animal1
{
	void bark() 
	{
		System.out.println("Barking ......");
	}
}

class BabyDog extends Dog1
{
	void weep() 
	{
		System.out.println("Weeping ......");
	}
}

public class MultilevelInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BabyDog b = new BabyDog();
		b.bark();
		b.eat();
		b.weep();

	}

}

package Inheritance;

interface Cake 
{
	void bake();
}
class Strawberry implements Cake
{
	public void bake() 
	{
		System.out.println("Baking The Strawberry Cake......");
	}
} 

class BlackForest implements Cake
{
	public void bake() 
	{
		System.out.println("Baking The Black Forest Cake.......");
	}
}

class CakeMain
{
	public static void main(String [] args) 
	{
		BlackForest b =  new BlackForest();
		b.bake();
		Strawberry s = new Strawberry();
		s.bake();
	}
}

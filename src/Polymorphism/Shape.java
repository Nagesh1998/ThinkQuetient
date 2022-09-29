package Polymorphism;

public class Shape {
	int length,breadth;
	float radius;
	
	public void area(int length,int breadth) 
	{
		System.out.println("Area of Rectangle is : "+length*breadth);
	}
	
	public void area(float length,float breadth) 
	{
		System.out.println("Area of Triangle is : "+0.5*length*breadth);
	}

	public void area(int length) 
	{
		System.out.println("Area of Square is : "+length*length);
	}
	public void area(double radius) 
	{
		System.out.println("Area of Circle is : "+radius*radius);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Shape s=new Shape();
		s.area(2, 3);
		s.area(2.2f, 3.3f);
		s.area(2);
		s.area(2.0);
	}

}

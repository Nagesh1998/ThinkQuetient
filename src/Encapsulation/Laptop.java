package Encapsulation;

public class Laptop {
	private static String os;
	private String brand;
	private static String price;
	static int negprice;
	
	public Laptop() 
	
	{
		
		System.out.println("This is default constructor : ");
		//os="Window";
		//brand="LENOVO";
		//price="50000";
		//negprice=40000;
	}
	
	Laptop(String os,String brand,String price,int negprice) 
	{	
		this();
	}
	Laptop(String brand) 
	{	
		this("Android","HP","450000",350000);
		os="Window";
		brand="HP";
		price="450000";
		negprice=440000;
	}
	
	public void Showdetails() 
	{
		System.out.println(this.os);
		System.out.println(this.brand);
		System.out.println(this.price);
		System.out.println(this.negprice);
	}

	

	public String getOs() 
	{
		return os;
	}

	public void setOs(String os) 
	{
		this.os = os;
	}

	public String getBrand() 
	{
		return brand;
	}

	public void setBrand(String brand) 
	{
		this.brand = brand;
	}

	public String getPrice() 
	{
		return price;
	}

	public void setPrice(String price) 
	{
		this.price = price;
	}
	
	public static void main(String []args) 
	{
		//Laptop l=new Laptop();
		//l.Showdetails();
		
		//Laptop l1=new Laptop("Android","HP","450000",350000);
		//l1.Showdetails();
		
		Laptop l2=new Laptop("Asus");
		l2.Showdetails();
		
	}
	
}

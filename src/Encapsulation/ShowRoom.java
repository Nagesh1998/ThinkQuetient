package Encapsulation;

public class ShowRoom {
	public void showDetails(Laptop l) 
	{
		System.out.println("OPerating System is : "+l.getOs());
		System.out.println("Brand is : "+l.getBrand());
		System.out.println("Price is : "+l.getPrice());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Laptop lap=new Laptop();
		lap.setOs("Window");
		lap.setBrand("HP");
		lap.setPrice("30000");
		ShowRoom s = new ShowRoom();
		s.showDetails(lap);
	}

}

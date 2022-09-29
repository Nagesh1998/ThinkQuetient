import java.util.Scanner;

public class Shop {

	int itemId,itemCost;
	String name;
	
	public void acceptItemDetails(int itid,int itcost,String n ) 
	{
		itemId=itid;
		itemCost=itcost;
		name=n;
	}
	
	public void showItemDetails() 
	{
		System.out.println("ID is "+itemId);
		System.out.println("Name is " +name);
		System.out.println("Cost is " +itemCost);
	}
	public void ShowBill(int qty) {
		
		
		int cost=qty*itemCost;
		System.out.println("Total Bill is : " +cost);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		Shop s = new Shop();
		s.acceptItemDetails(1, 300, "milk");
		s.showItemDetails();
		
		System.out.println("Enter the Quantity : ");
		int n = sc.nextInt();
		s.ShowBill(n);
		sc.close();
	}

}

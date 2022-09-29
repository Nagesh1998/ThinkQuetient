package Encapsulation;

public class Sports {

	public void showDetails(Player p) 
	{
		System.out.println("ID is : "+p.getId());
		System.out.println("Name is : "+p.getName());
		System.out.println("Age is : "+p.getAge());
		System.out.println("Height is : "+p.getHeight());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Player p = new Player();
		p.setAge(1);
		p.setHeight(165);
		p.setId(1);
		p.setName("Nagesh");
		
		Sports s = new Sports();
		s.showDetails(p);

	}

}

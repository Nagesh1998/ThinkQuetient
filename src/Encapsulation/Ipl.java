package Encapsulation;

public class Ipl {
	
	public void showDetails(Team t,Team t1) 
	{
		System.out.println("name is : "+t.getTeamName());
		System.out.println("Achievment  is : "+t.getTeamAchievment());
		System.out.println("size is : "+t.getTeamSize());
		System.out.println("Coach is : "+t.getTeamCoach());
		System.out.println("Captain is : "+t.getTeamCapt());
		System.out.println("\nAnother team is \n");
		System.out.println("name is : "+t1.getTeamName());
		System.out.println("Achievment  is : "+t1.getTeamAchievment());
		System.out.println("size is : "+t1.getTeamSize());
		System.out.println("Coach is : "+t1.getTeamCoach());
		System.out.println("Captain is : "+t1.getTeamCapt());
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Team t =  new Team();
		t.setTeamAchievment("word cup 2011");
		t.setTeamCapt("MS Dhoni");
		t.setTeamName("India");
		t.setTeamCoach("VVS laxman");
		t.setTeamSize("11 Player");
		
		Team t1 =  new Team();
		t1.setTeamAchievment("word cup 2007");
		t1.setTeamCapt("Marsh");
		t1.setTeamName("England");
		t1.setTeamCoach("ponting");
		t1.setTeamSize("11 Player");
		
		Ipl i = new Ipl();
		i.showDetails(t,t1);

		
		

	}

}

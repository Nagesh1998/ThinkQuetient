package Inheritance;

class IplTeam
{
	void play() 
	{
		System.out.println("Playing the match......");
	}
}

class CSK extends IplTeam
{
	void CSKPlaying() 
	{
		System.out.println("CSK Playing the match......");
	}
}

class RCB extends IplTeam
{
	void RCBPlaying() 
	{
		System.out.println("RCB Playing the match......");
	}
}
public class IplTeammain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CSK obj1 = new CSK();
		obj1.play();
		
		RCB obj = new RCB();
		obj.play();
		
	}

}

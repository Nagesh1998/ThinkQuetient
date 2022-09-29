
public class Semester {

	int phy,chem,maths;
	
	public void accepyDetails( int p,int c,int m) 
	{
		phy=p;
		chem=c;
		maths=m;
	}
	public void showDetails() 
	{
		System.out.println("Physics marks are : "+phy);
		System.out.println("Chemistry marks are : "+chem);
		System.out.println("Maths marks are : "+maths);
	}
	
}

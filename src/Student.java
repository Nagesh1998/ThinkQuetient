
public class Student {
	
	int rollNumber,phy,chem,maths;
	String name;
	
	public void aceeptDetails(int roll,int p,int c,int m,String n ) 
	{
		rollNumber=roll;
		phy=p;
		chem=c;
		maths=m;
		name=n;
		System.out.println("Students Details are initialized !!!!");
	}
	
	public void displayRecord() 
	{
		System.out.println("Roll Number "+rollNumber);
		System.out.println("Physics "+phy);
		System.out.println("Chemistry "+chem);
		System.out.println("Maths "+maths);
		System.out.println("Name "+name);
	}
	
	public void Percentage()
	{	
		float total=phy+chem+maths;
		float per=(total/300)*100;
		System.out.println("The percentage of " + name +" is :" + per);
	}
	
}

class ClassRoom{ 

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student s = new Student();
		s.aceeptDetails(1, 56, 66, 55, "Nagesh");
		s.displayRecord();
		s.Percentage();

	}

}


public class Employee {
	
    int emid;
    double salary;
    String name;
	
	public void accepyDetails( int id,double s,String n ) 
	{
		emid=id;
		salary=s;
		name=n;
	}
	public void showDetails() 
	{
		System.out.println("name is : "+name);
		System.out.println("id is  : "+emid);
		System.out.println("salary is  : "+salary);
	}

}

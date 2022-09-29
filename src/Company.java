
public class Company {
		
	public void showEmployeeWithighSalary(Employee e1,Employee e2) {
		
		//e1.salary > e2.salary ? e1.showDetails(): e2.showDetails();
		
		if(e1.salary > e2.salary) {
			
			System.out.println("Deatils of the highest employee having higest salary is ");
			e1.showDetails();
		}
		else
			System.out.println("Deatils of the highest employee having higest salary is ");
			e2.showDetails();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee em1 = new Employee();
		em1.accepyDetails(1, 2000, "Nagesh");
		em1.showDetails();
		
		Employee em2 = new Employee();
		em2.accepyDetails(2, 3000, "mangesh");
		em2.showDetails();
		
		Company c = new Company();
		c.showEmployeeWithighSalary(em1, em2);


	}

}

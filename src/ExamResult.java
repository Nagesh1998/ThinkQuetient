
public class ExamResult {
	
	public void Result(Semester sem1,Semester sem2) 
	{
		float pTotal= (sem1.phy+sem2.phy);	
		System.out.println("Total marks of physics is "+pTotal);
		
		float cTotal= (sem1.chem+sem2.chem);	
		System.out.println("Total marks of chemistry is "+cTotal);
		
		float mTotal= (sem1.maths+sem2.maths);	
		System.out.println("Total marks of maths is "+mTotal);
		
		
		float precentage = (pTotal+cTotal+mTotal)/600*100; 
		System.out.println("Total percentage is : "+precentage);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Semester s1 = new Semester();
		s1.accepyDetails(90, 80, 70);
 		//s1.showDetails();
 		
 		Semester s2 = new Semester();
 		s2.accepyDetails(80, 90, 70);
 		//s2.showDetails();
 		
 		ExamResult e = new ExamResult();
 		e.Result(s1, s2);
	}

}

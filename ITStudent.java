package aa3;

public class ITStudent extends Student{

	 public ITStudent(int sid, String name, String address, int age, String course_name, String college_name) {
		super(sid, name, address, age, course_name, college_name);
		
	}



	String sub[] = {"Java","python","cpp"};
	 int marks[] = {50,70,60};
	 float TotalMARKS = 0;
	 float  percentage;
	 
	 public void findTotal(){
		
		 for(int a:marks) {
			 TotalMARKS += a;
			
			 
		 }
		 System.out.println("Total marks of IT Student is: "+TotalMARKS);	 
	 }
	
	
	
	

	@Override
	public void findResult() {
		if(TotalMARKS > 250) {
			System.out.println("Passed with distinction");
		}else if(((TotalMARKS > 150) && (TotalMARKS <250))) {
			System.out.println("Passed");
			
		}else {
			System.out.println("Failed");
		}
		
		
	}

	@Override
	public void PlacementPercentage() {
		if(percentage > 75) {
			System.out.println("Eligible to sit for placement");
		}
		else {
			System.out.println("Not eligible to sit for placement");
		}
		
	}
	

     
	@Override
	public void calculatePercentage() {	
		percentage = (TotalMARKS/300)*100;
		System.out.println("Percentage of IT Student is :"+percentage);
		
	}
	


}

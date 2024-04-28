package aa3;

public class MathStudent extends Student {
	
	public MathStudent(int sid, String name, String address, int age, String course_name, String college_name) {
		super(sid, name, address, age, course_name, college_name);
		
	}

	String Sub[] = {"Trigonometry","Statistics","calculus"};
	int Mark[] = {80,82,78};
	float Tot_M;
	float perc;
	
	void findTotal(){
		for(int a:Mark) {
			Tot_M += a;
			
		}
		System.out.println("Total marks of Math student is: "+Tot_M);
		
	}
	
	void calculatePercentage(){
		perc = (Tot_M/300)*100;
		System.out.println("Percentage of math student is: "+perc);
		
	}

	@Override
	public void PlacementPercentage() {
		if(perc > 75) {
			System.out.println("Eligible to sit for placement");
		}
		else {
			System.out.println("Not eleigible to sit for placement");
		}
		
	}
	@Override
	public void findResult() {
		if(Tot_M > 250) {
			System.out.println("Passed with distinction");
		}else if(((Tot_M > 150) && (Tot_M <250))) {
			System.out.println("Passed");
			
		}else {
			System.out.println("Failed");
		}
		
		
		
	}

}

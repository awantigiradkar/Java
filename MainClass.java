package aa3;

public class MainClass {
	public static void main(String[] args) {
		Student S1 = new ITStudent(1,"Alex","Mumbai City Bungalow 3",24,"DAC","VIT");
		S1.findTotal();
		S1.calculatePercentage();
		S1.findResult();
		S1.PlacementPercentage();
		
		System.out.println();
		S1 = new MathStudent(2, "King", "Bombay bandra", 26, "DBDA", "VIIT");
		S1.findTotal();
		S1.calculatePercentage();
		S1.findResult();
		S1.PlacementPercentage();
	   
		
	}
	
		
		

}

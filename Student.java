package aa3;

public abstract  class Student implements PlacementInterface{
	int sid;
	String name;
	String address;
	int age;
	String course_name;
	String college_name;
	abstract void findResult();
	
	public Student(int sid, String name, String address, int age, String course_name, String college_name) {
		super();
		this.sid = sid;
		this.name = name;
		this.address = address;
		this.age = age;
		this.course_name = course_name;
		this.college_name = college_name;
	}

	
	void dispStudent() {
		System.out.println(sid+" "+name+" "+address+" "+age+" "+course_name+" "+college_name);
	}

//	@Override
//	public void PlacementPercentage() {
//		ITStudent.
//		System.out.println("Placement percentage is very high");
//		
//	}
	abstract void findTotal();
	abstract void calculatePercentage();

	

	

	
}

package aa1;

public class Student {
	int StudentId;
	String name;
	float mark;
	String course;
	String subject_name;
	String result = null;
	String reccee;
	
	public Student(int StudentId, String name, float mark, String course, String subject_name, String result,
			String reccee) {
		super();
		this.StudentId = StudentId;
		this.name = name;
		this.mark = mark;
		this.course = course;
		this.subject_name = subject_name;
		this.result = result;
		this.reccee = reccee;
	}
	
	public void dispStudent() {
		System.out.println(StudentId+" "+name+" "+mark+" "+course+" "+subject_name+" "+result+" "+reccee+" ");
	}
	
	

}

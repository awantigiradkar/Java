
public class Employee 
{

	int id;
	String name;
	float sal;
	public Employee(int id, String name, float sal) {
		
		this.id = id;
		this.name = name;
		this.sal = sal;
	}
	
	void display()
	{
		System.out.println(id+name+sal);
	}
	
	
}

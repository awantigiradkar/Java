
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
	
	
//	@Override
//	public String toString() {
//		return "Employee [id=" + id + ", name=" + name + ", sal=" + sal + "]";
//	}
	
	
	void dispEmployee()
	{
		System.out.println(id+" " +name+ " "+sal);
		
	}
	
	
}

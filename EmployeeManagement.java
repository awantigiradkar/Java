import java.util.ArrayList;
import java.util.Scanner;

public class EmployeeManagement
{

	public void displayempobject(ArrayList<Employee>  al) 
	{
		
		for( Employee e  :  al)
		{
			
			e.dispEmployee();
			
			
		}
		
		
	}

	public void updatempobject(ArrayList<Employee> al) 
	{
		
		System.out.println("enter the empno,sal to update");
		int eno;
		Scanner s = new Scanner(System.in);
		 eno = s.nextInt();
		float sa = s.nextFloat();
		
		
		for( Employee e  :al   )
		{
			if(e.id == eno)
			{
				e.sal = sa;
			}
			
					
		}
		
		System.out.println("update done");
		
	}

	public void deleteempobject(ArrayList<Employee> al)
	{
		System.out.println("enter the empno to delete");
		Scanner s = new Scanner(System.in);
		int eno = s.nextInt();
		
		int pos = 0;
		for( Employee e  :al   )
		{
			if(e.id == eno)
			{
				pos = al.indexOf(e);
			}
			
					
		}
		
		al.remove(pos);
		
	}

	public ArrayList<Employee> createempobject()
	{
		
		Employee e1 = new Employee(1001,"shan",30000);
		Employee e2 = new Employee(1002,"nsnathan",40000);
		Employee e3 = new Employee(1003,"raj",50000);
		Employee e4 = new Employee(1004,"arun",60000);
		Employee e5 = new Employee(1005,"Hari",70000);
		
		
		
		System.out.println("add");
		
		ArrayList<Employee> al = new ArrayList<>();
		
		al.add(e1);
		al.add(e2);
		al.add(e3);
		al.add(e4);
		al.add(e5);
		
		
		return al;
		
	}

	
	
	
	
}

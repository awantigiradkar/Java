import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListObjectExample 
{

	
	public static void main(String[] args) 
	{
		
		EmployeeManagement em  = new EmployeeManagement();
		
	
		
		
		System.out.println("create");
		
		ArrayList<Employee> al =em.createempobject();
		
		
		System.out.println("retrive");
			
		em.displayempobject(al);
		
		em.updatempobject(al);
		
		System.out.println("update");
		
		em.displayempobject(al);
		
		
		em.deleteempobject(al);
		
		System.out.println("delete");
		
		em.displayempobject(al);
		
		
		
		
		
		}
	
	
	
		
		
	}
	
	
	
	


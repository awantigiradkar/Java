import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class EmployeeObjectRead 
{

	public static void updatesal(Employee e) 
	{
		e.sal = e.sal +1000;
	}
	
	
	public static void main(String[] args) throws IOException, ClassNotFoundException 
	{
	
		FileInputStream fo = new FileInputStream("dbda2");
		ObjectInputStream oo = new ObjectInputStream(fo);
		Employee e;
//		Employee e1 = (Employee) oo.readObject();
//		Employee e2 = (Employee) oo.readObject();
//		Employee e3 = (Employee) oo.readObject();
//		e1.dispEmployee();
//		e2.dispEmployee();
//		e3.dispEmployee();
		ArrayList<Employee> al = new ArrayList<>();
		try
		{
		while((e = (Employee) oo.readObject())!=null)
		{
				
			al.add(e);
			//updatesal(e);
			e.dispEmployee();
		}
				
		}catch(EOFException eo)
		{
			System.out.println("no more records");
		}
		
		
		
		for(Employee obj :al)
		{
			System.out.println(obj.sal = obj.sal+100);
		}
		
		
		fo.close();
		oo.close();
	}

	
}

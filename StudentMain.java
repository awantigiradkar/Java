import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class StudentMain
{
	 static int counter_dbda;
	 static int counter_dac;
	 
	private static void findnumofcourse(Student obj) {
		if(obj.cname.equals("dbda"))
		{
			counter_dbda+=1;
		}
		else if(obj.cname.equals("dac"))
		{
			counter_dac+=1;
		}
		
	}
	
	
	
	
	
	public static void main(String[] args) throws IOException, ClassNotFoundException 
	{
//		Student s1=new Student(1001,"omkar","dbda");
//		Student s2=new Student(1002,"shan","desd");
//		Student s3=new Student(1003,"raj","dac");
	
		FileOutputStream fo = new FileOutputStream("dbda3");
		ObjectOutputStream oo = new ObjectOutputStream(fo);
		Scanner sc = new Scanner(System.in);
		System.out.println("object creation");
		for( int i = 0;i<3;i++)
		{
			Student s=new Student(sc.nextInt(),sc.next(),sc.next());
		    oo.writeObject(s);
		}
		oo.close();
		fo.close();
		
		FileInputStream fi = new FileInputStream("dbda3");
		ObjectInputStream oi = new ObjectInputStream(fi);
		Student obj;
		
//		Student obj1=(Student) oi.readObject();
//		obj1.display();
//		
//		Student obj2=(Student) oi.readObject();
//		obj2.display();
//		
//		Student obj3=(Student) oi.readObject();
//		obj3.display();
		
		
		try
		{
		while((obj=(Student) oi.readObject())!=null)
		{
			obj.display();
			findnumofcourse(obj);
		}
		}catch(EOFException e)
		{
			System.out.println("end of student object  ");
		}
		
		System.out.println("No of students in dac   "+ counter_dac);
		System.out.println("No of students in dbda   "+ counter_dbda);
		
		
		
		
		
		
	}

	
	
	
}

import java.io.File;
import java.io.IOException;

public class FileExample 
{

	public static void main(String[] args) throws IOException 
	{

		File f = new File("dbda5.txt");
		f.createNewFile();
		System.out.println("file created");
		System.out.println(f.canRead());
		System.out.println(f.canWrite());
		f.delete();
		System.out.println("file deleted");
			
		File f1 = new File("C:\\Users\\lenovo\\Desktop\\DBDA-MAR2024\\DAY13\\src");
		
		       String[] str = f1.list();
		for( String fname :str)
		{
			System.out.println(fname);
		}
		
		
		
	} 
	
	
	
}

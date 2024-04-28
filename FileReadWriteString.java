import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileReadWriteString 
{

	
	public static void main(String[] args) throws IOException 
	{
		Scanner sc = new Scanner (System.in);
		FileWriter fw = new FileWriter("dbda1.txt");
		
//		String str1 = "welcome to java ";
//		String str2 = "File handling ";
//		String str3 = "java exam will be conducted on Monday ";
//		String str4 = "result will be announced on the same day ";
//		fw.write(str1+"\n");
//		fw.write(str2+"\n");
//		fw.write(str3+"\n");
//		fw.write(str4+"\n");
		String str ;
		
		while(!(str = sc.nextLine()).equals("exit"))
				{
			
			fw.write(str+"\n");
				}

	
		
		System.out.println("file write is over");
		fw.close();
		
		FileReader fr = new FileReader("dbda1.txt");
		BufferedReader br = new BufferedReader(fr);
		System.out.println();
		System.out.println("read line by line");
		String obj;
//		String obj1 =br.readLine();
//		String obj2 =br.readLine();
//		String obj3 =br.readLine();
//		
//		System.out.println(obj1);
//		System.out.println(obj2);
//		System.out.println(obj3);
		
		while((obj = br.readLine())!=null)
		{
			System.out.println(obj);
		}
		
		
		
		
	}
	
}

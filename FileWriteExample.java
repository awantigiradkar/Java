import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileWriteExample 
{

	public static void main(String[] args) throws IOException 
	{
	
		FileWriter fw = new FileWriter("dbda.txt");
		
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		fw.write(str);
		System.out.println("file write is over");
		fw.close();
		
		
		FileReader fr = new FileReader("dbda.txt");
		BufferedReader br = new BufferedReader(fr);
		
		//int ch=fr.read();
		//System.out.println((char)ch);
		System.out.println("char by char");
		int ch=0;
		while((ch=fr.read())!=-1)
		{
			System.out.print((char)ch);
		}
		fr.close();
		
		FileReader fr1 = new FileReader("dbda.txt");
		BufferedReader br1 = new BufferedReader(fr1);
		System.out.println();
		System.out.println("read line by line");
		
		String str1 =br1.readLine();
		System.out.println(str1);
		
		
		
	}
	
}

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class PrimitiveReadWrite
{

	
	public static void main(String[] args) throws IOException, ClassNotFoundException 
	{
	
		int id=1001;
		String name="shan";
		float sal=3000;
		int[] num = {10,20,30,40};
		
		FileOutputStream fo = new FileOutputStream("dbda4");
		DataOutputStream dos = new DataOutputStream(fo);
		ObjectOutputStream oos = new ObjectOutputStream(fo);
		
		dos.writeInt(id);
		dos.writeUTF(name);
		dos.writeFloat(sal);
		oos.writeObject(num);
		
		fo.close();
		dos.close();
		
		FileInputStream fo1 = new FileInputStream("dbda4");
		DataInputStream dos1 = new DataInputStream(fo1);
		ObjectInputStream ois = new ObjectInputStream(fo1);
		try
		{
		int sid=dos1.readInt();
		String sname =dos1.readUTF();
		float ssal = dos1.readFloat();
		           int[] n=(int[]) ois.readObject();
		
		System.out.println(sid+sname+ssal);
		
		for(int ele :n)
		{
			System.out.println(ele);
		}
		
		}catch(EOFException e)
		{
			System.out.println("primitive read is over");
		}
		
		
	} 
	
	
}

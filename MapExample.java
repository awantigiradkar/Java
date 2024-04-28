import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class MapExample 
{

	public static void main(String[] args) 
	{
	
		
		HashMap<Integer, String> hm = new HashMap<>();
		
		
		hm.put(1, "sunbeam DBDA");
		hm.put(2, "cdac pune DBDA");
		hm.put(3, "CDAC Blr");
		hm.put(4, "KNOW IT DBDA");
		hm.put(5, "CDAC MUMBAI DBDA");
		
		System.out.println(hm);
		
		String cname=hm.get(3);
		System.out.println(cname);
		
		
		for( Map.Entry<Integer, String> m : hm.entrySet())
			
		{
			System.out.println(m.getKey() +" "+m.getValue());
			
			
		}
		
		System.out.println("update");
		
		hm.put(2, "cdac bangalore dac");
		
for( Map.Entry<Integer, String> m : hm.entrySet())
			
		{
			System.out.println(m.getKey() +" "+m.getValue());
			
			
		}
		
		System.out.println("delete");

		   hm.remove(2);
		   for( Map.Entry<Integer, String> m : hm.entrySet())
				
			{
				System.out.println(m.getKey() +" "+m.getValue());
				
				
			}

		   
		   
		   
	}
	
	
}

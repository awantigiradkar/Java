import java.util.ArrayList;
import java.util.Collections;

public class ArrayListExample
{

	
	public static void main(String[] args) 
	{
	
		
	   ArrayList<Integer>  al = new ArrayList<>();
	   
	   al.add(10);
	   al.add(100);
	   al.add(30);
	   al.add(50);
	   al.add(80);
	   
	   
	   for(Integer ele: al)
	   {
		   System.out.println(ele);
	   }
	   
	   
	   System.out.println("insert");
	   
	   al.add(3,100);
	   
	   for(Integer ele: al)
	   {
		   System.out.println(ele);
	   }
	   
	   
		
	   System.out.println("update");
	   
	   
	   al.set(3, 200);
	   
	   for(Integer ele: al)
	   {
		   System.out.println(ele);
	   }
		
	   
	   System.out.println("delete");
	   
	
	   al.remove(3);
	   
	   for(Integer ele: al)
	   {
		   System.out.println(ele);
	   }
	   
	   
	  int pos=al.indexOf(30);
	  
	  al.remove(pos);
	  System.out.println("delete element");
	  for(Integer ele: al)
	   {
		   System.out.println(ele);
	   }
	  System.out.println("search element 10");
	   
	  boolean con=al.contains(10);
	  System.out.println(con);
	  
	  System.out.println("sort");
	  
	  Collections.sort(al);
	  
	  for(Integer ele: al)
	   {
		   System.out.println(ele);
	   }
	}
	
}

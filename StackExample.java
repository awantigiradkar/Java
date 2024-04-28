import java.util.Stack;

public class StackExample
{

	
	public static void main(String[] args) 
	{
	
		Stack<Integer> s = new Stack<>();
		
		s.push(10);
		s.push(20);
		s.push(30);
		s.push(40);
		s.push(50);
		
		
		System.out.println(s);
				
		
		for(Integer ele : s)
		{
			System.out.println(ele);
		}
		System.out.println("the element poped");
		
		Integer obj =s.pop();
		System.out.println(obj);
		
		System.out.println("after pop");
		for(Integer ele : s)
		{
			System.out.println(ele);
		}
		System.out.println("after insert");
		s.add(2, 100);
		
		
		for(Integer ele : s)
		{
			System.out.println(ele);
		}
		
		System.out.println("after remove");
		s.remove(2);
		
		for(Integer ele : s)
		{
			System.out.println(ele);
		}
		
		s.set(2, 300);
		
		System.out.println("after update");
		
		for(Integer ele : s)
		{
			System.out.println(ele);
		}
		
	
	}
	
	
}

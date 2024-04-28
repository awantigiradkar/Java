import java.util.LinkedList;
import java.util.Stack;

public class LinkedListExample 
{

	public static void main(String[] args) 
	{
	
		LinkedList<Integer> ll = new LinkedList<>();
		
		ll.add(10);
		ll.add(20);
		ll.add(30);
		ll.add(40);
		ll.add(50);
		ll.add(60);
		
		System.out.println("display");
		System.out.println(ll);
		
		System.out.println("insert in pos");
		ll.add(3, 300);
		
	    System.out.println(ll);
		
	    System.out.println("modify in pos");
		ll.set(3, 400);
		 System.out.println(ll);
		
		System.out.println("add first");
		ll.addFirst(7);
		System.out.println(ll);
		 
		System.out.println("add last");
		ll.addLast(66);
		System.out.println(ll);
		
		System.out.println("remove");
		ll.remove(3);
		System.out.println(ll);
		
		
		
	}
	
	
}

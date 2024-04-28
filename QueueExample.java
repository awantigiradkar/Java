import java.util.PriorityQueue;

public class QueueExample
{

	
	public static void main(String[] args) 
	{
	
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		
		pq.add(10);
		pq.add(20);
		pq.add(30);
		pq.add(40);
		pq.add(50);
		
		System.out.println(pq);
		
		System.out.println(pq.poll());
		
		System.out.println(pq);
		
		System.out.println(pq.poll());
		
		System.out.println(pq);
		
		
		pq.remove(40);
		System.out.println(pq);
		
		
		System.out.println(pq.size());
		
		
	}
	
}

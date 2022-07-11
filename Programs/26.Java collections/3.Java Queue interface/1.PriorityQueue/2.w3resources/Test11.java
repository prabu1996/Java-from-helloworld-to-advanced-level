//Write a Java program to convert a priority queue to an array containing all of the elements of the queue.
import java.util.*;
class Test11
{
	public static void main(String arg[])
	{
		PriorityQueue<String> queue1=new PriorityQueue<String>();
		queue1.add("One");
		queue1.add("Two");
		queue1.add("Three");
	
		List<String> list=new ArrayList<String>(queue1);
		System.out.println(list);
	}
}
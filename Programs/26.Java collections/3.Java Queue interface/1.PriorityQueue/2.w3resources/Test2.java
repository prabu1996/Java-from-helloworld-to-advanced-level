//  Write a Java program to iterate through all elements in priority queue. 
import java.util.*;
class Test2
{
	public static void main(String arg[])
	{
		PriorityQueue<String> queue=new PriorityQueue<String>();
		queue.add("One");
		queue.add("Two");
		queue.add("Three");
		queue.forEach(a->{System.out.println(a);}); 
	}
}
//Write a Java program to "insert" a given element into a priority queue. 
import java.util.*;
class Test4
{
	public static void main(String arg[])
	{
		PriorityQueue<String> queue1=new PriorityQueue<String>();
		queue1.add("One");
		queue1.add("Two");
		queue1.add("Three");
		System.out.println(queue1);

		queue1.offer("Orange");
		System.out.println(queue1);
	}
}
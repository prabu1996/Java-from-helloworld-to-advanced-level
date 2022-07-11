// Write a Java program to add all the elements of a priority queue to another priority queue.
import java.util.*;
class Test3
{
	public static void main(String arg[])
	{
		PriorityQueue<String> queue1=new PriorityQueue<String>();
		queue1.add("One");
		queue1.add("Two");
		queue1.add("Three");
		
		PriorityQueue<String> queue2=new PriorityQueue<String>();
		queue2.add("Apple");
		queue2.add("Orange");

		queue1.addAll(queue2);
		System.out.println(queue1);
	}
}
// Write a Java program to compare two priority queues. 
import java.util.*;
class Test7
{
	public static void main(String arg[])
	{
		PriorityQueue<String> queue1=new PriorityQueue<String>();
		queue1.add("One");
		queue1.add("Two");
		queue1.add("Three");
		
		PriorityQueue<String> queue2=new PriorityQueue<String>();
		queue2.add("One");
		queue2.add("Two");
		queue2.add("Four");

		for(String element:queue1)
		{
			System.out.println(queue2.contains(element)? "True" : "False");
		}
	}
}
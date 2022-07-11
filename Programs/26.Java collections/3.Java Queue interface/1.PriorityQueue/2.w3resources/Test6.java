// Write a Java program to count the number of elements in a priority queue. 
import java.util.*;
class Test6
{
	public static void main(String arg[])
	{
		PriorityQueue<String> queue1=new PriorityQueue<String>();
		queue1.add("One");
		queue1.add("Two");
		queue1.add("Three");
		System.out.println(queue1.size());
	}
}
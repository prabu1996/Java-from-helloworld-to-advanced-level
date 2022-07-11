//Write a Java program to remove all the elements from a priority queue
import java.util.*;
class Test5
{
	public static void main(String arg[])
	{
		PriorityQueue<String> queue1=new PriorityQueue<String>();
		queue1.add("One");
		queue1.add("Two");
		queue1.add("Three");
		//queue1.clear();
		queue1.removeAll(queue1);
		System.out.println(queue1);
	}
}
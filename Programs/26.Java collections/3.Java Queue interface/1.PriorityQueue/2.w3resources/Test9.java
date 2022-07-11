//  Write a Java program to retrieve and remove the first element.
import java.util.*;
class Test9
{
	public static void main(String arg[])
	{
		PriorityQueue<String> queue1=new PriorityQueue<String>();
		queue1.add("One");
		queue1.add("Two");
		queue1.add("Three");
		queue1.poll();
		System.out.println(queue1);
	}
}
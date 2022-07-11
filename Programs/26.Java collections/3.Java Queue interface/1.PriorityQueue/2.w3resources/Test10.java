// Write a Java program to convert a Priority Queue elements to a string representation.
import java.util.*;
class Test10
{
	public static void main(String arg[])
	{
		PriorityQueue<String> queue1=new PriorityQueue<String>();
		queue1.add("One");
		queue1.add("Two");
		queue1.add("Three");
		System.out.println("queue1:"+queue1);
		String str=queue1.toString();
		System.out.println("String: "+str);
	}
}
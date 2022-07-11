// Write a Java program to create a new priority queue, add some colors (string) and print out the elements of the priority queue
import java.util.*;
class Test1
{
	public static void main(String arg[])
	{
		PriorityQueue<String> queue=new PriorityQueue<String>();
		queue.add("One");
		queue.add("Two");
		queue.add("Three");
		System.out.println(queue); 
	}
}
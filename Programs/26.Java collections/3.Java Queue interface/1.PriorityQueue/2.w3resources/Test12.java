//Write a Java program to change priorityQueue to maximum priorityqueue.
import java.util.*;
class Test12
{
	public static void main(String arg[])
	{
		PriorityQueue<Integer> queue1=new PriorityQueue<Integer>();
		queue1.add(56);
		queue1.add(1);
		queue1.add(53);
		queue1.add(0);
		queue1.add(10);
		System.out.println("queue1: "+queue1);
		System.out.println("maximum priority queue: ");
		Integer value=null;
		while((value=queue1.poll())!=null)
		{
			System.out.println(value);
		}
	}
}
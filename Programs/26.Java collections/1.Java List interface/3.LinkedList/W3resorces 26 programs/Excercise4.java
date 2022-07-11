// Write a Java program to iterate a linked list in reverse order.
import java.util.*;
class Excercise4
{
	public static void main(String arg[])
	{
		LinkedList<String> list=new LinkedList<String>();
		list.add("One");
		list.add("Three");
		list.add("Two");
		Iterator obj=list.descendingIterator();
		while(obj.hasNext())
		{
			System.out.println(obj.next());
		}
	}
}
// 3. Write a Java program to iterate through all elements in a linked list starting at the specified position.
import java.util.*;
class Excercise3
{
	public static void main(String arg[])
	{
		LinkedList<String> list=new LinkedList<String>();
		list.add("One");
		list.add("Three");
		list.add("Two");
		Iterator obj=list.listIterator(1);
		while(obj.hasNext())
		{
			System.out.println(obj.next());
		}
	}
}
// Write a Java program to iterate through all elements in a tree set.
import java.util.*;
class Test2
{
	public static void main(String arg[])
	{
		TreeSet<String> set=new TreeSet<String>();
		set.add("Apple");
		set.add("Orange");
		set.add("Guava");
		Iterator obj=set.iterator();
		while(obj.hasNext())
		{
			System.out.println(obj.next());
		}
	}
}
//Write a Java program to create a reverse order view of the elements contained in a given tree set
import java.util.*;
class Test4
{
	public static void main(String arg[])
	{
		TreeSet<String> set1=new TreeSet<String>();
		set1.add("Apple");
		set1.add("Orange");
		set1.add("Guava");
		Iterator obj=set1.descendingIterator();
		while(obj.hasNext())
		{
			System.out.println(obj.next());
		}
		
	}
}
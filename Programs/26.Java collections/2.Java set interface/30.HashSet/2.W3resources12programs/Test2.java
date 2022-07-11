// Write a Java program to iterate through all elements in a hash list.
import java.util.*;
class Test2
{
	public static void main(String arg[])
	{
		HashSet<String> set=new HashSet<String>();
		set.add("One");
		set.add("Two");
		set.add("Three");
		Iterator obj=set.iterator();
		while(obj.hasNext())
		{
			System.out.println(obj.next());
		}
	}
}
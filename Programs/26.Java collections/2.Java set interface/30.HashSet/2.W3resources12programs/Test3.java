// Write a Java program to get the number of elements in a hash set.
import java.util.*;
class Test3
{
	public static void main(String arg[])
	{
		HashSet<String> set=new HashSet<String>();
		set.add("One");
		set.add("Two");
		set.add("Three");
		System.out.println(set.size());
	}
}
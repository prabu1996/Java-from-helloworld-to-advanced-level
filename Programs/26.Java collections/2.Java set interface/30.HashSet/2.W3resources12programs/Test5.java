// Write a Java program to test a hash set is empty or not.
import java.util.*;
class Test5
{
	public static void main(String arg[])
	{
		HashSet<String> set=new HashSet<String>();
		set.add("One");
		set.add("Two");
		set.add("Three");
		System.out.println(set.isEmpty());
		set.clear();
		System.out.println(set.isEmpty());
	}
}
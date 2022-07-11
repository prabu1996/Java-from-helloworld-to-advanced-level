// Write a Java program to create a new tree set, add some colors (string) and print out the tree set.
import java.util.*;
class Test1
{
	public static void main(String arg[])
	{
		TreeSet<String> set=new TreeSet<String>();
		set.add("Apple");
		set.add("Orange");
		set.add("Guava");
		System.out.println(set);
	}
}
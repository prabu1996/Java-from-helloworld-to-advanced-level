//Write a Java program to get the first and last elements in a tree set.
import java.util.*;
class Test5
{
	public static void main(String arg[])
	{
		TreeSet<String> set1=new TreeSet<String>();
		set1.add("Apple");
		set1.add("Orange");
		set1.add("Guava");
		System.out.println(set1);
		System.out.println(set1.last());
		System.out.println(set1.first());
	}
}
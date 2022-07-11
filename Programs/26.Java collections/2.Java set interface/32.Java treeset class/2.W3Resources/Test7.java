//Write a Java program to get the number of elements in a tree set.
import java.util.*;
class Test7
{
	public static void main(String arg[])
	{
		TreeSet<String> set1=new TreeSet<String>();
		set1.add("Apple");
		set1.add("Orange");
		set1.add("Guava");
		System.out.println("set1 size: "+set1.size());
	}
}
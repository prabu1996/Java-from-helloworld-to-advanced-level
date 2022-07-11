//Write a Java program to compare two tree sets.
import java.util.*;
class Test8
{
	public static void main(String arg[])
	{
		TreeSet<String> set1=new TreeSet<String>();
		set1.add("Apple");
		set1.add("Orange");
		set1.add("Guava");
		TreeSet<String> set2=new TreeSet<String>();
		set2.add("Apple");
		set2.add("Orange");
		set2.add("Banana");
		for(String elements:set1)
		{
			System.out.println(set2.contains(elements)? "yes":"no");
		}
	}
}
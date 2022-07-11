// Write a Java program to compare two hash sets.
import java.util.*;
class Test10
{
	public static void main(String arg[])
	{
		HashSet<String> set1=new HashSet<String>();
		set1.add("One");
		set1.add("Two");
		set1.add("Three");	
		
		HashSet<String> set2=new HashSet<String>();
		set2.add("Apple");
		set2.add("Orange");
		set2.add("Three");

		for(String compare:set1)
		{
			System.out.println(set2.contains(compare)? "Yes":"No");
		}
	}
}